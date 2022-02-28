package by.maksimmaiseichyk.array.validator;

public class ArrayLineValidation {
        public static final String REGEX_ARRAY = "\\s*(-\\s*)?\\d+(\\s*;\\s*(-\\s*)?\\d+)*";

        public static boolean isLineCorrect(String line){
                return line != null && (line.isBlank() || line.matches(REGEX_ARRAY)) ;
        }
}
