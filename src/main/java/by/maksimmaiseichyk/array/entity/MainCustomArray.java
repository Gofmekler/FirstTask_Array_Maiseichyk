package main.java.by.maksimmaiseichyk.array.entity;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class MainCustomArray {
    private int[] array;

    public MainCustomArray(){
    }
    public int[] getArray(){
        int[] cloneArray = Arrays.copyOf(array, array.length);
        return cloneArray;
    }
    public void setArray(int[] array){
        this.array = array;
    }
    public boolean isEmpty(){
        return array == null;
    }
}
