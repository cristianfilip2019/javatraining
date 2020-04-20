
package demologger;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MainDemoLogger {

        public static void main(String[] args) {
                DemoLogger obj = new DemoLogger();
                obj.makeSomeLog();
                LogManager lgmngr = LogManager.getLogManager();
                Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
                log.log(Level.INFO, "This is a log message");
                
        }
        
}
