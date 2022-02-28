package by.maksimmaiseichyk.array.datafilereader.impl;

import by.maksimmaiseichyk.array.datafilereader.DataReader;
import by.maksimmaiseichyk.array.parser.ArrayParser;
import by.maksimmaiseichyk.array.validator.ArrayLineValidation;

import java.io.*;
import java.util.ArrayList;

public class DataReaderImpl implements DataReader {

    @Override
    public ArrayList<String> readFile(String filePath) {

        ArrayList<String> result = new ArrayList<String>();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String lineOfFile;
            while ((lineOfFile = bufferedReader.readLine()) != null) {
                if (ArrayLineValidation.isLineCorrect(lineOfFile)) {
                    result.add(lineOfFile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
