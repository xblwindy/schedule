package com.itstyle.quartz.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root&useUnicode=true&characterEncoding=UTF8&useSSL=false");
                            Statement s =  conn.createStatement();
            System.out.println(conn.isClosed());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
