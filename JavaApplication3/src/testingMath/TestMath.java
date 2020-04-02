/*
 * Testing math class methods
 */
package testingMath;

/**
 * Testing math class methods
 * @author servi
 */
public class TestMath {

    public static void main(String[] args) {
        // create 4 numbers, 2 doubles and 2 integers
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;
        
        //apply absolute value, ceiling of, floor, rint, max and min methods
        System.out.printf("the absolute value " + "of %.3f is %.3f%n", a, Math.abs(a));
        System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));
        System.out.printf("the floor of " + "%.2f is %.0f%n", b, Math.floor(b));
        System.out.printf("the rint of %.2f " + "is %.0f%n", b, Math.rint(b));
        System.out.printf("the max of %d and " + "%d is %d%n", c, d, Math.max(c, d));
        System.out.printf("the min of %d" + "and %d is %d%n", c, d, Math.min(c, d));
        //exponetial demo
        double x = 11.635;
        double y = 2.76;
        System.out.printf("the value of " + "e is %.4f%n", Math.E);
        System.out.printf("exp(%.3f)" + " is %.3f%n", x, Math.exp(x));
        System.out.printf("log(%.3f) is " + "%.3f%n", x, Math.log(x));
        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n", x, y, Math.pow(x, y));
        System.out.printf("sqrt(%.3f) is " + "%.3f%n", x, Math.sqrt(x));
        
        //trigonometric demo
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        System.out.format("The value of pi " + "is %.4f%n", Math.PI);//constant PI=3.1415...ide defined in Math
        System.out.format("the sine of %.1f " + "degrees is %.4f%n", degrees, Math.sin(radians));
        System.out.format("the cosine of %.1f " + "degrees is %.4f%n", degrees, Math.toDegrees(Math.asin(Math.sin(radians))));
        
        //random number generated between 0.0 and 0.1 and multiplied with 10
        int randomNumber = (int)(Math.random()*10);//generate numbers between 0 and 10
        System.out.println(randomNumber + " is a random number");
        randomNumber = (int)(Math.random()*10);
        System.out.println(randomNumber + " is a random number");
        randomNumber = (int)(Math.random()*10);
        System.out.println(randomNumber + " is a random number");
                
        
    }
    
}
