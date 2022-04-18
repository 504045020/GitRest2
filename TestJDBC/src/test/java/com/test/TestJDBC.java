package com.test;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {

        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
        String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "insert into dept values (50,'教学部','北京')";
        int rows = statement.executeUpdate(sql);
        System.out.println("影响数据行"+rows);
        statement.close();
        connection.close();
    }
}
