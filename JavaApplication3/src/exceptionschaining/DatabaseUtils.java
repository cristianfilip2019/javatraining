
package exceptionschaining;

import java.sql.*;

public class DatabaseUtils {
      public static void executeQuery(String sql) throws SQLException{
             throw new SQLException("Syntax Error"); 
      }  
}
