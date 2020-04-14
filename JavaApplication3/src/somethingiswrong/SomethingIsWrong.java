package somethingiswrong;

public class SomethingIsWrong {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.setWidth((float) 10.0);
        myHouse.setLenght((float) 5.0);
        System.out.println("My house's area is " + myHouse.area());
    }
}
