
package LambdaExpressions;

public class Greeting {
   // inner interface HelloWorld
    interface HelloWorld{
        //method says hello in a specific language to a specified person 
        public void greetSomeone(String someone);
    }
    //method sayHello prints
    public void sayHelloInSpanish(){
        //Lambda expression
        HelloWorld spanishGreeting = (String someone) -> {
            System.out.println("Hola, " + someone);
        };
        spanishGreeting.greetSomeone("Don Quijote");
    }
    
    public static void main(String[] args) {
        Greeting greet = new Greeting();
        greet.sayHelloInSpanish();
    }
}
