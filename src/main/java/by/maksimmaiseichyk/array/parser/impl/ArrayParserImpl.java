package by.maksimmaiseichyk.array.parser.impl;

import by.maksimmaiseichyk.array.parser.ArrayParser;

import java.util.ArrayList;

public class ArrayParserImpl implements ArrayParser {

    public int[] parseLineByLine(ArrayList<String> arrayList) {
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = Integer.parseInt(arrayList.get(i));
        }
        return array;
    }
}
