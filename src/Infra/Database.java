package Infra;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Database {

    private static String username = "usuario";
    private static String password = "phc28@09";
    private static String database = "pessoas";
    private static String url = "jdbc:mysql://localhost:3306/" + database;
    private static Connection connect;
    private Database(){
    }
//Database deve ser ConnectionFactory
    public static Connection getConnection(){
        if(connect == null){
            try {
                connect = DriverManager.getConnection(url, username, password);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connect;
    }

}