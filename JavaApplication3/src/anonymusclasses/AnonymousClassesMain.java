
package anonymusclasses;

public class AnonymousClassesMain {

    interface SayHello{
        public void sayHello();
        
    }
    
    public static void main(String[] args) {
        //greet using named class
        class SayHelloInEnglish implements SayHello{
            @Override
            public void sayHello() {
                System.out.println("Hello world!");
            }            
        }
        SayHelloInEnglish englishGreet = new SayHelloInEnglish();
        englishGreet.sayHello();
        
        //greet using anonymous class
        SayHello englishGreetAnonymous = new SayHello(){
            @Override
            public void sayHello() {
                System.out.println("Hello World!");
            }    
        };
        
        englishGreetAnonymous.sayHello();
    }    
}
