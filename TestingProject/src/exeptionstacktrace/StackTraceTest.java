/*
 * Testing stacktrace to file
 */
package exeptionstacktrace;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Testing stacktrace to file
 * @author servi
 */
public class StackTraceTest {

        public static void main(String[] args) {
                try{
                        Handler handler  = new FileHandler("F:\\OneDrive\\desktop\\Outfile.log");
                        Logger.getLogger("").addHandler(handler);
                }
                catch(IOException e){
                        Logger logger = Logger.getLogger("package.name");
                        StackTraceElement elements[]  = e.getStackTrace();
                        for(int i = 0, n = elements.length; i < n; i++) {
                                logger.log(Level.WARNING, elements[i].getMethodName());
                        }
                }
        }
        
}
