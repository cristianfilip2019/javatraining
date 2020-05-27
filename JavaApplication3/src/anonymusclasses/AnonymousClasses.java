/*
        Public class anonymusclasses.
        It has main method.
        Includes 1 interface.
 */
package anonymusclasses;

public class AnonymousClasses {

        //Includes 1 interface
        //Interface includes 1 method.
        interface SayHello {

                //method of interface.
                public void sayHello();
        }

        public static void main(String[] args) {
                //Includes 1 inner class, witch implements class interface, overrides its method.
                class SayHelloInEnglish implements SayHello {
                        //method prints in console.
                        @Override
                        public void sayHello() {
                                System.out.println("Hello world!");
                        }
                }
                //creates one object of type of inner class and calls its method.
                SayHelloInEnglish englishGreet = new SayHelloInEnglish();
                englishGreet.sayHello();

                //declaration type of anonymous class, implementing class interface.
                SayHello englishGreetAnonymous = new SayHello() {
                        //override interface method and prints in console.
                        @Override
                        public void sayHello() {
                                System.out.println("Hola mundo!");
                        }
                };
                //calls anonymus class method.
                englishGreetAnonymous.sayHello();
        }
}
