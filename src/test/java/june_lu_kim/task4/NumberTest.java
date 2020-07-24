package june_lu_kim.task4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class NumberTest {
    Number number = new Number();
    FileWriter mockWriter = mock(FileWriter.class);

    @Before
    public void Before() {
        System.out.println("Test is starting");

    }

    @After
    public void After() {
        System.out.println("Test is finish");
        System.out.println();
    }

    // правильно ли применен метод assertNotNull???
    @Test
    public void writeFile() throws IOException {
     doThrow(new IOException()).when(mockWriter).write("345");
     mockWriter.write("345");
     mockWriter.close();

    }

    //
    @Test
    public void readFromFile() throws Exception {
        System.out.println("Test read file");
        String testFile = "C:\\Users\\Admin\\MavenJUnitHome\\number.txt";
        String expected = "345";
        String result = number.readFromFile(testFile);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void changeNumberEight() throws IOException {
        String test = "C:\\Users\\Admin\\MavenJUnitHome\\number.txt";
        String expected = "531";
        String result = number.changeNumberEight(test);
        Assert.assertEquals(expected,result);

    }

    @Test
    public void changeNumberSixteen() throws IOException{
        String test = "C:\\Users\\Admin\\MavenJUnitHome\\number.txt";
        String expected = "159";
        String result = number.changeNumberSixteen(test);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void changeNumberBinary() throws FileNotFoundException {
        String test = "C:\\Users\\Admin\\MavenJUnitHome\\number.txt";
        String expected = "101011001";
        String result = number.changeNumberBinary(test);
        Assert.assertEquals(expected,result);

    }
}