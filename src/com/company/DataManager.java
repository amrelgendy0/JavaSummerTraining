package com.company;
import com.company.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class DataManager {
 private static   HashSet<User> users = new HashSet<User>();
    private static HashSet<Drug> drugs = new HashSet<Drug>();
    private static HashSet<Patient> patients = new HashSet<Patient>();
    static private Connection con = null;
    public static void addPatient(Patient p) throws SQLException {
        String query = "INSERT INTO Patient (firstname, lastname, Age, prescribeMedicine,Address,Doctor,Date) VALUES (?,?, ?, ?,?,?,?)";
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
    }
    public DataManager() throws SQLException {
        String username = "root";
        String password = "Amr@2020";
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PH", username, password);
      getUsers();
    }

    public  static void addDrug(Drug d) throws SQLException {
         String query = "INSERT INTO Drug (name, type, exdate, price) VALUES (?,?, ?, ?)";
        PreparedStatement preparedStmt = con.prepareStatement(query);
        preparedStmt.setString(1,d.getName());
        preparedStmt.setString(2,d.getType());
        preparedStmt.setString(3,d.getExpireDate());
        preparedStmt.setDouble(4,d.getPrice());
       preparedStmt.execute();
       getDrug();
preparedStmt.close();
    }

    public static Patient getPathent(String name)
    {for(Patient p : patients){
        if((p.getFirstname() + " " + p.getLastname()).equals(name)){
            return  p;
        }
    }
        return null;
    }

public static ArrayList<Drug> searchMedicine(String key) throws SQLException {
        getDrug();
ArrayList<Drug> searchedDrug = new ArrayList<Drug>();
    for (Drug drug : drugs) {
        if (drug.values().contains(key)) {
            searchedDrug.add(drug);
        }
    }
    return searchedDrug;
}

    public static HashSet<Patient> getPathient() throws SQLException {
        patients.clear();
        String query = "SELECT * FROM Patient";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            patients.add(new Patient(rs.getString("firstname"), rs.getString("lastname"), rs.getDouble("Age")
                    , rs.getString("prescribeMedicine"), rs.getString("Address"), rs.getString("Doctor"),
                    rs.getString("Date"),
                    rs.getInt("id")
            ));
        }
        st.close();
        return patients;
    }
    
    private static HashSet<User> getUsers() throws SQLException {
        users.clear();
        String query = "SELECT * FROM Users";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
          String firstName = rs.getString("username");
          String pass = rs.getString("password");
          boolean isAdmin = rs.getBoolean("isAdmin");
          users.add(new User(firstName,pass,isAdmin));
       }
      st.close();
      return users;
    }

    private static HashSet<Drug>  getDrug() throws SQLException {
        drugs.clear();
        String query = "SELECT * FROM Drug";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while (rs.next())
        {
            drugs.add(new com.company.model.Drug(
                    rs.getString("name"),rs.getDouble("price"),
                    rs.getString("exdate"),
                    rs.getInt("id"),
                    rs.getString("type")));
        }
        st.close();
        return drugs;
    }
    public static HashSet<Drug> drugs() {
        return drugs;
    }
    public static HashSet<Patient> patients() {
        return patients;
    }
    public static HashSet<User> users() {
        return users;
    }
}

