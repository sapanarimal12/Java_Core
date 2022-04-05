package com.javacore.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo {

    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/student";
        String username="root";
        String  password="root";

        try {
            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("Database connected");
            Statement statement=conn.createStatement();
//             statement.executeUpdate("INSERT INTO user(FIRST_NAME,LAST_NAME) VALUES('Harry','Smith')");
            //statement.executeUpdate("INSERT INTO user(FIRST_NAME,LAST_NAME) VALUES('Bipana','Rimal')");

            //statement.executeUpdate("INSERT INTO user(FIRST_NAME,LAST_NAME) VALUES('Jyoti','Rimal')");
            //  System.out.println("Data Inserted Successfully");
            //statement.executeUpdate("delete from user where LAST_NAME='Rimal'");
            //statement.executeUpdate("update  user SET  LAST_NAME='king' where ID=50");

            ResultSet resultSet;
            String  sql="SELECT FIRST_NAME  FROM user ";
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                //System.out.println(" User Id :" +resultSet.getInt("ID"));
                System.out.println(" User First Name :" +resultSet.getString("FIRST_NAME"));
               //System.out.println(" User Last Name:" +resultSet.getString("LAST_NAME"));

            }
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
