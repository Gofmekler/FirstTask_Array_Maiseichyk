package by.maiseichyk.array.service;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.service.impl.ChangeArrayImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChangeArrayImplTest {
    ChangeArrayImpl arrayChangeService = new ChangeArrayImpl();

    @Test
    public void testChangeElements() {
        MainCustomArray customArray = new MainCustomArray(new int[]{2, 3, 10, 42});
        arrayChangeService.changeElements(customArray, "<", 5, 0);
        int[] actual = customArray.getArray();
        int[] expected = new int[]{0, 0, 10, 42};
        assertEquals(actual, expected);
    }
}