/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.seminario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // java.sql = Connection, DriverManager, Statement, ResultSet
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/seminariocest4p";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
}
