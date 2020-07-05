
package multithreadinghusbandwife;

public class Husband extends Thread {

        @Override
        public void run() {
                Thread runVacuum = new VacuumCleaner();
                runVacuum.start();
        }
}
