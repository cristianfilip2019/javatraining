/*
 
 */
package testingPackage;

public class finalKeyword {

        private final int speedLimit;

        public finalKeyword(int speedLimit) {
                this.speedLimit = speedLimit;
        }

        public static void main(String[] args) {
                finalKeyword fk = new finalKeyword(180);
                System.out.println("speed limit is: " + fk.speedLimit);
        }

}
