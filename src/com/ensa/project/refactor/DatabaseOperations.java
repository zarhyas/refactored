package com.ensa.project.refactor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseOperations {
    public void listData() throws SQLException {
        // connection logic
        Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");

        // listing logic

        // disconnection logic
        connection.close();
    }

    public void addData(String data) throws SQLException {
        // connection logic
        Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");

        // listing logic

        // disconnection logic
        connection.close();
    }

    // similar methods
}