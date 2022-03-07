package by.maksimmaiseichyk.array.utils;

public class UniqueIdGenerator {

    private static int id = 0;

    private UniqueIdGenerator(){
    }

    public static int getId() {
        return id++;
    }
}
