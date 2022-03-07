package by.maksimmaiseichyk.array.comparator;

import by.maksimmaiseichyk.array.entity.MainCustomArray;

import java.util.Comparator;

public class FirstElementArrayComparator implements Comparator<MainCustomArray> {
    @Override
    public int compare(MainCustomArray o1, MainCustomArray o2) {
        int result = Integer.compare(o1.getArray()[0], o2.getArray()[0]);
        return result;
    }
}
