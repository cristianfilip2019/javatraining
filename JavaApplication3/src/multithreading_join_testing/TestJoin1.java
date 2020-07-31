package multithreading_join_testing;

public class TestJoin1 extends Thread {

        @Override
        public void run() {
                for (int i = 1; i <= 5; i++) {
                        try {
                                Thread.sleep(500);
                        } catch (InterruptedException e) {
                                System.out.println(e);
                        }
                        System.out.println(i);
                }
        }

        public static void main(String args[]) {
                TestJoin1 t1 = new TestJoin1();
                TestJoin1 t2 = new TestJoin1();
                TestJoin1 t3 = new TestJoin1();
                
                t1.start();
                try {
                        t1.join();
                } catch (InterruptedException e) {
                        System.out.println(e);
                }
                t2.start();              
                t3.start();
        }
}
