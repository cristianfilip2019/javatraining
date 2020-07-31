
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
                String user = "CRISTIAN";
                String password = "CRISTIAN";
                String url = "jdbc:derby://localhost:1527/FIRSTDB;create=true";
                String driver = "org.apache.derby.jdbc.ClientDriver";
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;
                try{
                        Class driverClass = Class.forName(driver);
                        connection = DriverManager.getConnection(url, user, password);
                        statement = connection.createStatement();                        
                        resultSet = statement.executeQuery("SELECT*FROM FIRSTTABLE");                        
                }
                catch(ClassNotFoundException | SQLException e){
                        Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, e);
                }
                finally{
                        if(null != connection){
                                try {
                                        connection.close();
                                } catch (SQLException ex) {
                                        Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                        if(null != statement){
                                try {
                                        statement.close();
                                } catch (SQLException ex) {
                                        Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                        if(null != resultSet){
                                try {
                                        resultSet.close();
                                } catch (SQLException ex) {
                                        Logger.getLogger(MyProject.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                }
        }
        
}
