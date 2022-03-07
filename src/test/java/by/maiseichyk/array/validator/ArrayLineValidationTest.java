package by.maiseichyk.array.validator;

import by.maksimmaiseichyk.array.validator.ArrayLineValidation;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayLineValidationTest {
    private final String incorrectElementsString = "1 2 3 4 5 6 7 8 9";
    private final String correctElementsString = "-1; -2; -3; -4; -5; -6; -7; -8; -9";

    @Test
    public void testIsLineCorrect() {
        boolean actual = ArrayLineValidation.isLineCorrect(correctElementsString);
        assertTrue(actual);
    }

    @Test
    public void testIsLineIncorrect() {
        boolean actual = ArrayLineValidation.isLineCorrect(incorrectElementsString);
        assertFalse(actual);
    }
}