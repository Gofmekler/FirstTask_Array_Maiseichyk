package by.maksimmaiseichyk.array.entity;

import by.maksimmaiseichyk.array.observer.ArrayEvent;
import by.maksimmaiseichyk.array.observer.ArrayObservable;
import by.maksimmaiseichyk.array.observer.ArrayObserver;
import by.maksimmaiseichyk.array.utils.UniqueIdGenerator;

import java.util.Arrays;

public class MainCustomArray implements ArrayObservable {
    private int[] array;
    private final int id;
    private ArrayObserver observer;

    public MainCustomArray() {
        id = UniqueIdGenerator.getId();
    }

    public MainCustomArray(int... array) {
        id = UniqueIdGenerator.getId();
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
        notifyObserver();
    }

    public int getLength(){
        return array.length;
    }

    public int getId(){
        return id;
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

    public void attach(ArrayObserver observer){
        this.observer = observer;
    }

    public void detach(ArrayObserver observer){
        this.observer = null;
    }

        public void notifyObserver() {
        ArrayEvent event = new ArrayEvent(this);
        if (observer != null) {
            observer.arrayParametersChanged(event);
        }
    }
}
