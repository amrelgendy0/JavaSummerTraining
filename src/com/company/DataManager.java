package com.company;

import com.company.model.Drug;
import com.company.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;

public class DataManager {
 public static   HashSet<User> users = new HashSet<User>();
 public static   HashSet<Drug> drugs = new HashSet<Drug>();
  static private   Connection con = null;




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

public static ArrayList<Drug> searchMedicine(String key) throws SQLException {
        getDrug();
ArrayList<Drug> searchedDrug = new ArrayList<Drug>();
        for(Drug drug : drugs){
            if(drug.values().contains(key)){

searchedDrug.add(drug);
            }

        }

        return  searchedDrug;
}


 public static  HashSet<User>  getUsers() throws SQLException {
        users.clear();
      String query = "SELECT * FROM Users";
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(query);
      while (rs.next())
      {
          String firstName = rs.getString("username");
          String pass = rs.getString("password");
          boolean isAdmin = rs.getBoolean("isAdmin");
          users.add(new User(firstName,pass,isAdmin));
       }
      st.close();

      return users;
    }

    public static  HashSet<Drug>  getDrug() throws SQLException {
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

}

