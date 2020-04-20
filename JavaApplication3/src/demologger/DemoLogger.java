
package demologger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogger {
        private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        public void makeSomeLog(){
                LOGGER.log(Level.INFO, "My first Log Message");
        }
}

