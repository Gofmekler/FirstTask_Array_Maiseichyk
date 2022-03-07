package by.maksimmaiseichyk.array.parser.impl;

import by.maksimmaiseichyk.array.parser.ArrayParser;
import by.maksimmaiseichyk.array.validator.ArrayLineValidation;

import java.util.ArrayList;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ArrayParserImpl implements ArrayParser {
    private static final Logger LOGGER = LogManager.getLogger();
    private static final String SPLIT_REGEX = ",";

    public ArrayList<int[]> parseAll(ArrayList<String> arrayList) {
        LOGGER.info("parse string array list method called");
        ArrayList<int[]> intCustomArrays = new ArrayList<>();
        int[] intArray;
        for (String line : arrayList) {
            if (ArrayLineValidation.isLineCorrect(line)) {
                intArray = parseString(line);
                intCustomArrays.add(intArray);
            }
        }
        return intCustomArrays;
    }

    private int[] parseString(String line) {
        int[] arrayLines;
        String[] lineParts = line.split(SPLIT_REGEX);
        arrayLines = parseToIntArray(lineParts);
        return arrayLines;
    }

    private int[] parseToIntArray(String[] lines) {
        int[] customArray = new int[lines.length];
        for (int i = 0; i < customArray.length; i++) {
            customArray[i] = Integer.parseInt(lines[i]);
        }
        return customArray;
    }
}
