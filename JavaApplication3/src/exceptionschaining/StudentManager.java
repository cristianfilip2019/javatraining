
package exceptionschaining;

import java.sql.SQLException;

public class StudentManager {
        private StudentDAO dao;
        public StudentManager(StudentDAO dao){
                this.dao = dao;
        }
        public void findStudents(String keyword) throws StudentException, SQLException{
                try{
                        dao.list();
                }
                catch(DAOException ex){
                        throw new StudentException("Error finding students.", ex);
                }
        }
}
