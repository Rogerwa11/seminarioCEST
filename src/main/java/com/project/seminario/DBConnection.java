package com.project.seminario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/seminariocest4p";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
}
