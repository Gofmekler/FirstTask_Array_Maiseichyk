package by.maksimmaiseichyk.array.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayLineValidation {
        private static final Logger LOGGER = LogManager.getLogger();
        public static final String REGEX_ARRAY = "\\s*(-\\s*)?\\d+(\\s*;\\s*(-\\s*)?\\d+)*";

        public static boolean isLineCorrect(String line){
                LOGGER.info("validate string method called");
                return line != null && (line.isBlank() || line.matches(REGEX_ARRAY)) ;
        }
}
