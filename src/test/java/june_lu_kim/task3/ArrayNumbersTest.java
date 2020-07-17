package june_lu_kim.task3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayNumbersTest {
    ArrayNumbers arrayNumbers = new ArrayNumbers();

    @Before
    public void Before() {
        System.out.println("Test is starting");

    }

    @After
    public void After() {
        System.out.println("Test is finish");
        System.out.println();
    }

    @Test
    public void sumArray() {
        System.out.println("Test sumArray");
        int resSum = arrayNumbers.sumArray(12,23,45,13,8);
        int expSum = arrayNumbers.sumArray(12,23,45,13,8);
        System.out.println("Result test: " + expSum);
        Assert.assertEquals(expSum, resSum);

    }

    @Test
    public void average() {
        System.out.println("Test average");
        int resAverage = arrayNumbers.average(12,23,45,13,8);
        int expAverage = arrayNumbers.average(12,23,45,13,8);
        System.out.println("Result test: " + expAverage);
        Assert.assertEquals(expAverage, resAverage);
    }

    @Test
    public void maxElement() {
        System.out.println("Test maxElement");
        int resMaxElement = arrayNumbers.maxElement(12,23,45,13,8);
        int expMaxElement = arrayNumbers.maxElement(12,23,45,13,8);
        System.out.println("Result test: " + expMaxElement);
        Assert.assertEquals(expMaxElement, resMaxElement);
    }

    @Test
    public void minElement() {
        System.out.println("Test minElement");
        int resMinElement = arrayNumbers.minElement(12,23,45,13,8);
        int expMinElement = arrayNumbers.minElement(12,23,45,13,8);
        System.out.println("Result test: " + expMinElement);
        Assert.assertEquals(expMinElement, resMinElement);
    }
}