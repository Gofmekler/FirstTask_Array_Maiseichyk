package by.maksimmaiseichyk.array.validator;

public class ArrayLineValidation {
        public static final String REGEX_ARRAY = "";

        public boolean isLineCorrect(String line){
                return (line.isBlank() || line.matches(REGEX_ARRAY));
        }
}
