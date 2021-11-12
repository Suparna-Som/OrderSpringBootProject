package com.order.OrderSpringBootProject.Connection;

import com.order.OrderSpringBootProject.Credentials.Credentials;
import org.springframework.stereotype.Component;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Component
public class JDBCconnection {
public static Connection connect() {

        Connection connection ;
        Credentials credentials = new Credentials();
        String DB_URL = credentials.url;
        String USER = credentials.user;
        String PASS = credentials.pass;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
            return null;
        }
        if (connection != null) {
            System.out.println("Connection working");
        } else {
            System.out.println("Connection not working");
        }
        return connection;
    }
}
