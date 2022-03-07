package by.maiseichyk.array.service;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.service.impl.CalculateArrayImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculateArrayImplTest {
    CalculateArrayImpl arrayCalculateService = new CalculateArrayImpl();

    @Test
    public void testArraySum() {
        MainCustomArray customArray = new MainCustomArray(new int[]{1, 4, 5, 6});
        int actualSum = arrayCalculateService.arraySum(customArray);
        int expected = 16;
        assertEquals(actualSum, expected);
    }

    @Test
    public void testArrayAverage() {
        MainCustomArray customArray = new MainCustomArray(new int[]{1, 4, 5, 6});
        double actualAverage = arrayCalculateService.arrayAverage(customArray);
        double expected = 4.0;
        assertEquals(actualAverage, expected);
    }
}