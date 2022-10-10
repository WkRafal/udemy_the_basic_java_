package org.example;

import java.sql.*;

public class JDBC_select_example {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/test", "root","");
            if (conn == null) {
                System.out.println("brak polaczenia");
            } else {
                System.out.println("jest połączenie");
            }

            statement = conn.createStatement();
            String sql = "SELECT * FROM employees WHERE id > 1";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String adress = resultSet.getString("address");
                int salary = resultSet.getInt("salary");
                System.out.println("id: "  + id + " name: " + name + " salary: " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
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
