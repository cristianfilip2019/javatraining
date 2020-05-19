/*
 * Test multiprocess
 */
package multithreading;

import com.sun.istack.internal.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;

/**
 * Test multiprocess
 * @author servi
 */
public class Multiprocess {
        public static void main(String[] args) {
                try{
                        ProcessBuilder pb;
                        //use process builder to start 2 processes multithreading.SayHello with parameter
                        pb = new ProcessBuilder(
                                "java",
                                "-classpath",
                                "C:\\Users\\servi\\Documents\\NetBeansProjects\\javatraining\\JavaApplication3\\build\\classes",
                                "multithreading.SayHello",
                                "3", "Ion", "Gheorghe", "Maria");
                        Map<String, String> env = pb.environment();
                        env.put("TEXT_CONGRATS", "felicitari pentru pornirea procesului!");
                        env.remove("OTHERVAR");
                        env.put("TEXT_HI", "salut");
                        pb.directory(new File("C:\\Users\\servi\\Documents\\NetBeansProjects\\javatraining\\JavaApplication3\\build\\classes\\multithreading"));
                        Process p1 = pb.start();
                        Process p2 = pb.start();
                        /*//start notepad
                        ProcessBuilder pb1;
                        pb1 = new ProcessBuilder("Notepad");
                        Process p3 = pb1.start();
                        //start write
                        ProcessBuilder pb2;
                        pb2 = new ProcessBuilder("write");
                        Process p4 = pb2.start();*/
                }
                catch(IOException ex){
                        Logger logger = Logger.getLogger(Multiprocess.class);
                        logger.log(Level.SEVERE, "An IO exception is here!", ex);
                }
        }        
}
