package com.task_Solution2_JDBC;

import java.sql.*;

public class Solution2 {
    public static void main(String[] args){
    //Database connection details
    String db_url="jdbc:mysql://localhost";
    String user="root";
    String password="root";

    //Establish connection with Database
    try {
        Connection con= DriverManager.getConnection (db_url, user, password);
        //validate the connection
        if(con!=null) {
            System.out.println("The Database connection was successfull.");

        //create a reference to statement to perform insertion operation
        Statement s= con.createStatement();

        //write SQL Query
        String createDB="create database testdb";
        String use="Use testdb";
        String createTable="CREATE TABLE Employee (empcode INT, empname VARCHAR(50), empage INT, esalary INT)";
        String select="Select * from Employee";
        String insert="INSERT INTO Employee (empcode, empname, empage, esalary) VALUES " + "(101, 'Jenny', 25, 10000), " + "(102, 'Jacky', 30, 20000), " + "(103, 'Joe', 20, 40000), " + "(104, 'John', 40, 80000), " + "(105, 'Shameer', 25, 90000)";

        //Execute Create DB Query
        s.execute(createDB);
        //Execute Use DB Query
        s.execute(use);
        //Execute Table Creation Query
        s.execute (createTable);
        //Execute Insert into Query
        s.execute(insert);

        //Execute Query to Display Data
        ResultSet rs = s.executeQuery(select);
        while (rs.next()) {
            //Print the Object
            System.out.println(rs.getInt("empcode") +"  "+ rs.getString("empname") +"  "+ rs.getInt("empage") +"  "+ rs.getInt("esalary"));
        }
        } else {
            System.out.println("The Database connection was not successfull");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}