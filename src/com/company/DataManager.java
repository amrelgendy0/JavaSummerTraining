package com.company;

import com.company.model.Drug;
import com.company.model.Patient;
import com.company.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DataManager {
    private static final ArrayList<User> users = new ArrayList<User>();
    private static final ArrayList<Drug> drugs = new ArrayList<Drug>();
    private static final ArrayList<Patient> patients = new ArrayList<Patient>();
    static private Connection con = null;

    public static void addPatient(Patient p) {
        String query = "INSERT INTO Patient (firstname, lastname, Age, prescribeMedicine,Address,Doctor,Date) VALUES (?,?, ?, ?,?,?,?)";
        try {
            if (con == null) {
                throw new SQLException();
            }
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, p.getFirstname());
            preparedStmt.setString(2, p.getLastname());
            preparedStmt.setDouble(3, p.getAge());
            preparedStmt.setString(4, p.getPrescribeMedicine());
            preparedStmt.setString(5, p.getAddress());
            preparedStmt.setString(6, p.getDoctor());
            preparedStmt.setString(7, p.getDate());
            preparedStmt.execute();
            getPathient();
            preparedStmt.close();
        } catch (SQLException throwables) {
            System.out.println("please run mySql first");
patients.add(p);
        }
    }
    public static void initDataBase()
    {
        String username = "root";
        String password = "Amr@2020";
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PH", username, password);
        } catch (SQLException throwables) {
            System.out.println("please run mySql first");}
        getUsers();
        getDrug();
    }

    public  static void addDrug(Drug d){
         String query = "INSERT INTO Drug (name, type, exdate, price) VALUES (?,?, ?, ?)";
         try {if(con==null){
             throw new SQLException();
         }
             PreparedStatement preparedStmt = con.prepareStatement(query);
             preparedStmt.setString(1,d.getName());
             preparedStmt.setString(2,d.getType());
             preparedStmt.setString(3,d.getExpireDate());
             preparedStmt.setDouble(4,d.getPrice());
             preparedStmt.execute();
             getDrug();
             preparedStmt.close();
         } catch (SQLException throwables) {
             System.out.println("please run mySql first");
             drugs.add(d);
         }

    }

    public static Patient getPathent(String name)
    {for(Patient p : patients){
        if((p.getFirstname() + " " + p.getLastname()).equals(name)){
            return  p;
        }
    }
        return null;
    }

public static ArrayList<Drug> searchMedicine(String key)  {
            getDrug();
    ArrayList<Drug> searchedDrug = new ArrayList<Drug>();
    for (Drug drug : drugs) {
        if (drug.values().contains(key)) {
            searchedDrug.add(drug);
        }
    }
    return searchedDrug;
}

    public static ArrayList<Patient> getPathient() {

        String query = "SELECT * FROM Patient";
        try{
            if(con==null){
                throw new SQLException();
            } patients.clear();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                patients.add(new Patient(rs.getString("firstname"), rs.getString("lastname"), rs.getInt("Age")
                        , rs.getString("prescribeMedicine"), rs.getString("Address"), rs.getString("Doctor"),
                        rs.getString("Date"),
                        rs.getInt("id")
                ));
            }
            st.close();

        } catch (SQLException throwables) {
            System.out.println("please run mySql first");
            if (patients.isEmpty()) {
                patients.addAll(Arrays.asList(StaticDataIfSqlServerNotFound.getPatients()));
            }

        }

        return patients;
    }

    private static void getUsers() {
        users.clear();
        String query = "SELECT * FROM Users";
        try {
            if (con == null) {
                throw new SQLException();
            }
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String firstName = rs.getString("username");
                String pass = rs.getString("password");
                boolean isAdmin = rs.getBoolean("isAdmin");
                users.add(new User(firstName,pass,isAdmin));
            }
            st.close();
        } catch (SQLException throwables) {
            System.out.println("please run mySql first");


            if (users.isEmpty()) {
                users.addAll(Arrays.asList(StaticDataIfSqlServerNotFound.getUsers()));
            }

        }

    }

    private static void getDrug() {
        try {
            if (con == null) {
                throw new SQLException();
            }
            drugs.clear();
            String query = "SELECT * FROM Drug";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                drugs.add(new com.company.model.Drug(
                        rs.getString("name"),rs.getDouble("price"),
                        rs.getString("exdate"),
                        rs.getInt("id"),
                        rs.getString("type")));
            }
            st.close();

        } catch (SQLException throwables) {
            System.out.println("please run mySql first");
if(drugs.isEmpty()){
    drugs.addAll(Arrays.asList(StaticDataIfSqlServerNotFound.getDrugs()));
}

        }
    }

    public static ArrayList<Drug> getdrugs() {
        return drugs;
    }

    public static ArrayList<User> users() {
        return users;
    }

}

