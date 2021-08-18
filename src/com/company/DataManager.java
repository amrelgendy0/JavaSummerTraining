package com.company;
import com.company.model.*;
import java.sql.*;
import java.util.*;

public class DataManager {
 private static   HashSet<User> users = new HashSet<User>();
    private static HashSet<Drug> drugs = new HashSet<Drug>();
    private static HashSet<Patient> patients = new HashSet<Patient>();
    static private Connection con = null;


    public static void addPatient(Patient p){


        String query = "INSERT INTO Patient (firstname, lastname, Age, prescribeMedicine,Address,Doctor,Date) VALUES (?,?, ?, ?,?,?,?)";
        try {if(con==null){
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

    public static HashSet<Patient> getPathient() {

        String query = "SELECT * FROM Patient";
        try{
            if(con==null){
                throw new SQLException();
            } patients.clear();
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

        } catch (SQLException throwables) {
            System.out.println("please run mySql first");

        }

        return patients;
    }

    private static HashSet<User> getUsers()  {
        users.clear();
        String query = "SELECT * FROM Users";
        try{
if(con==null){
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
            users.add(new User("0","0",true));
        }

        return users;
    }

    private static HashSet<Drug>  getDrug() {
        try{
            if(con==null){
                throw new SQLException();
            }
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

        } catch (SQLException throwables) {
            System.out.println("please run mySql first");

            drugs.addAll(Arrays.asList(getDrugsLocalIfSqlServerNotFound()));
        }
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

   private static Drug[] getDrugsLocalIfSqlServerNotFound(){


        Drug[] drug = new Drug[]{
                new Drug("PANADOL COLD & FLU DAY 24 TAB",27,"30/09/2022",15524501,"Medications"),
                new Drug("ALCOHOL 70% 100 ML",18,"20/06/2025",15524502,"Sanitizers / Hand Gel"),
                new Drug("C-RETARD ( VITAMIN C ) 500 MG 10 CAP",16,"01/01/2024",15524503,"VITAMIN / Immunity Enhancer"),
                new Drug("OMEGA – 3 – PLUS 30 CAP",41.75,"20/06/2025",15524504,"Medicines for regulating blood fats / Immunity Enhancer"),
                new Drug("GARNIER BY NUTRISSE H.COLOR CR. 7.11",55,"12/12/2023",15524505,"Hair Care"),
                new Drug("ORAL-B 40 ULTRA THIN BLACK SOFT (2×1)",53,"30/09/2022",15524506,"Toothbrush"),
                new Drug("ASPIRIN PROTECT 100 MG 20 TAB",21,"20/06/2025",15524507,"Medications / blood"),
                new Drug("VASELINE PURE PETROLEUM JELLY 50ML ORGINAL",21,"12/12/2023",15524508,"Body Moisturizers"),
                new Drug("CALCIUM CARBONATE",59,"30/09/2022",15524509,"VITAMIN / Immunity Enhancer"),
                new Drug("ASPOCID 75 MG 20 TAB",6,"20/06/2025",15524510,"Medications"),
                new Drug("HEAD&SHOULDERS DANDRUFF SH. 400ML MENTHOL",48,"01/01/2024",15524511,"Hair Care"),
                new Drug("PLETAAL 50 MG 20 TAB",70,"11/03/2023",15524512,"Medications"),
                new Drug("SENSODYNE TOOTHPASTE 50GM MULTI CARE & WHITENING",33,"20/06/2025",15524513,"Toothpaste"),
                new Drug("STROKA 75 MG 30 TAB",145,"30/09/2022",15524514,"Medications"),
                new Drug("CORASORE 150 MG 20 TAB",16,"01/01/2024",15524515,"Medications"),
                new Drug("LUX SHW.GEL250ML MAGICAL BEAUTY",33,"11/03/2023",15524516,"Body Care"),
                new Drug("VIDROP (VITAMIN – D3) ORAL DROPS 15 ML",10.5,"30/09/2022",15524517,"VITAMIN / Immunity Enhancer"),
                new Drug("COMTREX ACUTE HEAD COLD 20 TAB",30,"11/03/2023",15524518,"Medications / RESPIRATORY DRUGS"),
                new Drug("LUNA SUN TAN OIL SPR. 130ML SPF15",92,"20/06/2025",15524519,"Sun Care"),
                new Drug("ORLY 120 MG 30 CAP",97.5,"01/01/2024",15524520,"WEIGHT LOSS AND WEIGHT CONTROL DRUGS"),
                new Drug("DIET SWEET 100 TAB",13,"11/03/2023",15524521,"WEIGHT LOSS AND WEIGHT CONTROL DRUGS"),
                new Drug("ANTIFLU 20 CAP",12.75,"30/09/2022",15524522,"Medications / RESPIRATORY DRUG"),
                new Drug("FA DEOD SPR. 150ML WHITENING CARE",48.25,"11/03/2023",15524523,"Body Care"),
                new Drug("NIGHT CALM 3 MG 20 TAB",33,"01/01/2024",15524524,"MEDICINES AFFECTING THE NERVOUS SYSTEM"),
                new Drug("BIVATRACIN 150 ML POWDER SPRAY",36,"20/06/2025",15524525,"TOPICAL PREPARATIONS")
        };

        return drug;
    }

}

