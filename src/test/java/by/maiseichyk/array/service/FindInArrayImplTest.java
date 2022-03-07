package by.maiseichyk.array.service;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.service.impl.FindInArrayImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindInArrayImplTest {
    private final MainCustomArray customArray = new MainCustomArray(25, 2, 4, 6, 8, 15, -1);

    FindInArrayImpl arrayFindService = new FindInArrayImpl();


    @Test
    public void testArrayMin() {
        int actual = arrayFindService.arrayMin(customArray);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void testArrayMax() {
        int actual = arrayFindService.arrayMax(customArray);
        int expected = 25;
        assertEquals(actual, expected);
    }

    @Test
    public void testNegativeInArray() {
        int actual = arrayFindService.negativeInArray(customArray);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testPositiveInArray() {
        int actual = arrayFindService.positiveInArray(customArray);
        int expected = 6;
        assertEquals(actual, expected);
    }
}