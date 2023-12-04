package org.ricodev.Collections.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionToDb {
    public static void main(String[] args) throws Exception {


        String  url="jdbc:mariadb://localhost:3306/EquiBill";
        String username="root";
        String  password="rico";
        String  query="select * from users";
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection(url,username,password);
        System.out.println("connection established");
        Statement statement=connection.createStatement();
        ResultSet  result=statement.executeQuery(query);
        System.out.println(result.toString());


        connection.close();


    }
}
