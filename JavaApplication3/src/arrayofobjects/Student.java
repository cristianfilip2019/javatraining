
package arrayofobjects;

public class Student {       
        public String name;
        
        public Student(String name){               
                this.name = name;
        }
        
        @Override
        public String toString(){
                return name;
        }
}
