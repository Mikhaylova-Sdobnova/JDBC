package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String BD_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_task";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "juliacorleone12@";

    public static Connection getConnection() {
        Connection connection = null;

            try {
                Class.forName(BD_DRIVER);
                connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println("Connected successfully!");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.out.println("Connection failed =(");
            }
            return connection;
    }
}
