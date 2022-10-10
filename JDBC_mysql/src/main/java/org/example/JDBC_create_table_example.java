
package org.example;

import java.sql.*;

public class JDBC_create_table_example {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/test", "root","");
            if (conn == null) {
                System.out.println("brak polaczenia");
            } else {
                System.out.println("jest połączenie");
            }

            statement = conn.createStatement();
            String sql = "CREATE TABLE books ("
                    + "id int AUTO_INCREMENT PRIMARY KEY,"
                    + "title varchar(20) NOT NULL,"
                    + "published date"
                    + ");";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
