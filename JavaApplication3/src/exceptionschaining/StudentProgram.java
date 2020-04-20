
package exceptionschaining;

import java.sql.SQLException;

public class StudentProgram {

        public static void main(String[] args) throws SQLException {
                StudentDAO dao = new StudentDAO();
                StudentManager manager = new StudentManager(dao);
                try{
                        manager.findStudents("tom");
                }
                catch(StudentException ex){
                        ex.printStackTrace();
                }
        }
        
}
