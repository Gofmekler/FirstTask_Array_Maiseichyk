package main.java.by.maksimmaiseichyk.array.service.impl;

import main.java.by.maksimmaiseichyk.array.service.ChangeArrayInterface;
import main.java.by.maksimmaiseichyk.array.entity.MainCustomArray;

public class ChangeArrayService implements ChangeArrayInterface {

    @Override
    public void changeElements(MainCustomArray customArray, String term, int whatToChange, int changeTo) {
        int[] tempArray = customArray.getArray();
        switch (term){
            case("<"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] < whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case(">"):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] > whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case("="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] == whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case("!="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] != whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case(">="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] >= whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            case("<="):
                for (int i = 0; i < tempArray.length; i++) {
                    if (tempArray[i] <= whatToChange) {
                        tempArray[i] = changeTo;
                    }
                }
                customArray.setArray(tempArray);
                break;
            //default:

        }
    }
}
