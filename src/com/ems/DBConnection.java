package com.ems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/employee_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "sql123";

    public static Connection getConnection() {
        try {
    		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employee_db?user=root&password=sql123");

            System.out.println("Database Connected Successfully!");
            return con;
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
        return null;
    }
}