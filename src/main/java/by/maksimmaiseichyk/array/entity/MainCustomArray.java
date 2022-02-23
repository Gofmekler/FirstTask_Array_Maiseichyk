package by.maksimmaiseichyk.array.entity;

import java.util.Arrays;

public class MainCustomArray {
    private int[] array;

    public MainCustomArray() {
    }

    public MainCustomArray(int... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public boolean isEmpty(){
        return array == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        MainCustomArray customArray = (MainCustomArray) obj;
        if (array.length != customArray.array.length) {
            return false;
        }
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] != customArray.array[i]){
                return false;
            }
        }
        return true;
    }

    public int hashCode(){
        return Arrays.hashCode(array);
    }

     public String toString(){
         StringBuilder stringBuilder = new StringBuilder();
         for (int a : array) {
             stringBuilder.append(a).append(" ");
         }
         return stringBuilder.toString();
     }
}
