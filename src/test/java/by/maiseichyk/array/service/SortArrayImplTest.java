package by.maiseichyk.array.service;

import by.maksimmaiseichyk.array.entity.MainCustomArray;
import by.maksimmaiseichyk.array.service.SortArrayService;
import by.maksimmaiseichyk.array.service.impl.SortArrayImpl;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SortArrayImplTest {
    MainCustomArray arrayForSort = new MainCustomArray(8, 5, 6, -2, 0);
    private final int[] expectedArray = new int[]{8, 6, 5, 0, -2};
    SortArrayImpl arraySortService = new SortArrayImpl();

    @Test
    public void testBubbleSort() {
        arraySortService.bubbleSort(arrayForSort);
        int[] actualArray = arrayForSort.getArray();
        assertEquals(actualArray, expectedArray);
    }

    @Test//StackOverflowError
    public void testQuickSort() {
        arraySortService.quickSort(arrayForSort);
        int[] actualArray = arrayForSort.getArray();
        assertEquals(actualArray, expectedArray);
    }

    @Test
    public void testSelectionSort() {
        arraySortService.selectionSort(arrayForSort);
        int[] actualArray = arrayForSort.getArray();
        assertEquals(actualArray, expectedArray);
    }
}