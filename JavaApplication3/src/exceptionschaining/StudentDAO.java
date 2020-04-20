
package exceptionschaining;

import java.sql.*;

public class StudentDAO {
        public void list() throws DAOException{
                try{
                        DatabaseUtils.executeQuery("SELECT");
                }
                catch(SQLException ex){
                        throw new DAOException("Error quering students from database", ex);
                }
        }
}
