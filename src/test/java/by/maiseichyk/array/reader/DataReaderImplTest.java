package by.maiseichyk.array.reader;

import by.maksimmaiseichyk.array.datafilereader.impl.DataReaderImpl;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class DataReaderImplTest {
    final static String pathToExistFile = "src/test/resources/testdata/data.txt";
    DataReaderImpl reader = new DataReaderImpl();

    @Test
    public void testReadFile() {
        ArrayList<String> actual = reader.readFile(pathToExistFile);
        List<String> expected = Arrays.asList("1; 2; 3", "", "11; 2","22; 123; 42; 221; -12");
        assertEquals(actual, expected);
    }
}