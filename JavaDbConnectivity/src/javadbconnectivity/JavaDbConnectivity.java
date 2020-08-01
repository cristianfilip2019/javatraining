/*
 * Java Database Connectivity
 */
package JavaDbConnectivity;

import java.util.logging.Logger;
import java.sql.*;
import java.util.logging.Level;

public class JavaDbConnectivity {
    
    public static void main(String[] args) {
        String user = "test";
        String password = "test";
        String url = "jdbc:derby://localhost:1527/DBnume;create=true";
        String driver = "org.apache.derby.jdbc.ClientDataSource40";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //statement.execute("CREATE TABLE table1 (CNP INT PRIMARY KEY, NUME VARCHAR(24), PRENUME VARCHAR(24), LOCALITATE VARCHAR(24))");
            //statement.execute("INSERT INTO table1 VALUES (123,'Filip','Cristian','Bucuresti'),(456,'Filip','Darius','Bucuresti')");
            resultSet = statement.executeQuery("SELECT * FROM table1");
            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                Integer cnp = 0;
                String nume = "";
                String prenume = "";
                String localitate = "";
                System.out.println("CNP  NUME  PRENUME  LOCALITATE");
                System.out.println("======================");
                do {
                    cnp = resultSet.getInt(1);
                    nume = resultSet.getString(2);
                    prenume = resultSet.getString(3);
                    localitate = resultSet.getString(4);
                    System.out.println(cnp + "    " + nume + "    " + prenume + "    " + localitate);                    
                } while(resultSet.next()); 
            }
            else{
                System.out.println("No rows found in table.");
            }
        } catch(ClassNotFoundException | SQLException e){
            Logger.getLogger(JavaDbConnectivity.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if(null != connection){
                try {
                    connection.close();
                } catch(SQLException ex) {
                    Logger.getLogger(JavaDbConnectivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(null != statement){
                try {
                    statement.close();
                } catch(SQLException ex) {
                    Logger.getLogger(JavaDbConnectivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(null != resultSet){
                try {
                    resultSet.close();
                } catch(SQLException ex) {
                    Logger.getLogger(JavaDbConnectivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }    
}
