package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyProject {

    public static void main(String[] args) {
        String user = "app";
        String password = "app";
        String url = "jdbc:derby://localhost:1527/sample;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from DERBYDB");
            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                Integer currentID = 0;
                String currentName = "";
                System.out.println("NUM    ADDR");
                System.out.println("==========");
                while (resultSet.next()) {
                    currentID = resultSet.getInt(1);
                    currentName = resultSet.getString(2);
                    System.out.println(currentID + "   " + currentName);
                }
            } else {
                System.out.println("No rows found in ResultSet");
            }
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (null != statement) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (null != resultSet) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
