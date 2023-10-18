package com.ensa.project.refactor.A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseOperations {

    private Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
        // connection logic
        return connection;
    }

    private void disconnect(Connection connection) throws SQLException {
        if(connection != null && !connection.isClosed()) {
            // disconnection logic
            connection.close();
        }
    }

    public void listData() throws SQLException {
        Connection connection = connect();

        // listing logic

        disconnect(connection);
    }

    public void addData(String data) throws SQLException {
        Connection connection = connect();

        // adding data logic

        disconnect(connection);
    }
}
