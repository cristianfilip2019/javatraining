
package AnonymusClasses;

public class HelloWorldAnonymusClasses {

    interface HelloWorld{
        public void greet();
        public void greetSomeone(String someone);
    }
    
    public void sayHello(){
        
        class EnglishGreeting implements HelloWorld{
            String name = "world";
            public void greet(){
                greetSomeone("world");
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        
        HelloWorld EnglishGreeting = new EnglishGreeting();
        
        HelloWorld frenchGreeting = new HelloWorld(){
            String name = "tout le monde";
            public void greet(){
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        HelloWorld spanishGreeting = new HelloWorld(){
            String name = "mundo";
            public void greet(){
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Hola " + name);
            }
        };
        
        EnglishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
        frenchGreeting.greet();
    }
    
    public static void main(String[] args) {
        HelloWorldAnonymusClasses myApp = new HelloWorldAnonymusClasses();
        myApp.sayHello();
    }
}