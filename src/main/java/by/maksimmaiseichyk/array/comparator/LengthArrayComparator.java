package by.maksimmaiseichyk.array.comparator;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

import java.util.Comparator;

public class LengthArrayComparator implements Comparator<MainCustomArray> {
    @Override
    public int compare(MainCustomArray o1, MainCustomArray o2) {
        int result = Integer.compare(o1.getLength(), o2.getLength());
        return result;
    }
}
