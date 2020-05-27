/*
        Public class HelloWorldAnonymusClasses.
        It has main method.
        Includes 1 interface.
        includes 1 method.
 */

package anonymusclasses;

public class HelloWorldAnonymusClasses {        
        //includes 1 interface
        //interface includes 2 methods
        interface HelloWorld {

                public void greet();

                public void greetSomeone(String someone);
        }
        //method saysHello()
        //includes 1 inner class
        //includes 1 anonymus inner class
        public static void main(String[] args) {
                       //inner class implements class interface
                       //includes 1 attribute
                       //includes 2 overriden methods implemented from class interface
                class EnglishGreeting implements HelloWorld {

                        String name;

                        @Override
                        public void greet() {
                                greetSomeone("world");
                        }

                        @Override
                        public void greetSomeone(String someone) {
                                name = someone;
                                System.out.println("Hello " + name);
                        }
                }

                HelloWorld englishGreeting = new EnglishGreeting();

                HelloWorld frenchGreeting = new HelloWorld() {
                        String name;

                        @Override
                        public void greet() {
                                greetSomeone("tout le monde");
                        }

                        @Override
                        public void greetSomeone(String someone) {
                                name = someone;
                                System.out.println("Salut " + name);
                        }
                };
              
                HelloWorld spanishGreeting = new HelloWorld() {
                        String name;

                        @Override
                        public void greet() {
                                greetSomeone("mundo");
                        }

                        @Override
                        public void greetSomeone(String someone) {
                                name = someone;
                                System.out.println("Hola " + name);
                        }
                };

                englishGreeting.greet();
                frenchGreeting.greetSomeone("Fred");
                spanishGreeting.greet();
                frenchGreeting.greet();
        }
}
