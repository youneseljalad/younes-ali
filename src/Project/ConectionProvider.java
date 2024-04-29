package Project;

import java.sql.*;

public class ConectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "123456");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
