package main.java.by.maksimmaiseichyk.array.entity;

import java.util.Arrays;

public class MainCustomArray {
    private int[] array;

    public MainCustomArray(){
    }

    public MainCustomArray(int... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray(){
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array){
        this.array = array;
    }
}
