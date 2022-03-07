package by.maksimmaiseichyk.array.datafilereader.impl;

import by.maksimmaiseichyk.array.datafilereader.DataReader;
import by.maksimmaiseichyk.array.validator.ArrayLineValidation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;

public class DataReaderImpl implements DataReader {
    private static final Logger LOGGER = LogManager.getLogger();

    public ArrayList<String> readFile(String filePath) {
        LOGGER.info("read stings from datafile method called");

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
            LOGGER.error("Reader throw exception",e);
            e.printStackTrace();
        }
        return result;
    }
}
