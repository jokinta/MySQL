package com.company.java_connected_with_mysql;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        createConnection();
    }


      public static void createConnection() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiss_shifts","root","root");
                System.out.println("DataBase connection successs");
                Statement statement = con.createStatement();
               ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEE");
                       while(rs.next()){
                           Integer id = rs.getInt("id");
                           String name = rs.getString("nameOfEmployee");
                           String position = rs.getString("positionInFirm");
                           System.out.printf("%d | %s | %s |\n",id,name,position);
                           System.out.println("--------------------");
                       }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }