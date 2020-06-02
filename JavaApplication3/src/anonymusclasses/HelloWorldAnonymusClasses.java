/*
        Public class HelloWorldAnonymusClasses.
        Includes main method.
        Includes 1 interface.        
 */
package anonymusclasses;

public class HelloWorldAnonymusClasses {

        //includes 1 interface
        //interface includes 2 methods
        interface HelloWorld {

                public void greet();

                public void greetSomeone(String someone);
        }

       
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
                        public void greetEnglishPeople(){
                                System.out.println("How are you?");
                        }
                }
                //new object created of type interface HelloWorld with the constructor EnglishGreeting
                EnglishGreeting englishGreeting = new EnglishGreeting();
                //anonymus class created from interface HelloWorld
                //includes 2 overriden methods implemented from class interface
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
                //anonymus class created from interface HelloWorld
                //includes 2 overriden methods implemented from class interface
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
                englishGreeting.greetEnglishPeople();
                frenchGreeting.greetSomeone("Fred");
                spanishGreeting.greet();
                frenchGreeting.greet();
                
        }
}
