package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String url = "jdbc:mysql://localhost:3306/syka";
    private static String login = "root";
    private static String password = "12345";
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e2) {
            e2.printStackTrace();
        }
        return con;
    }
}
