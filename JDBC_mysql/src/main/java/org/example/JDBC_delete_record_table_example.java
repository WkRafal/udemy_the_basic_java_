
package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_delete_record_table_example {
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
                String sql = "DELETE FROM employees WHERE id = 4";
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
