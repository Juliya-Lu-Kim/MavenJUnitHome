package june_lu_kim.task2;

import june_lu_kim.task2.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

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
    public void sum() {
        System.out.println("Test sum");
        int a = 20;
        int b = 30;
        int res = calculator.sum(a, b);
        int exp = 50;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void subtraction() {
        System.out.println("Test subtraction");
        int a = 20;
        int b = 50;
        int res = calculator.subtraction(a, b);
        int exp = 30;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void multiplication() {
        System.out.println("Test multiplication");
        int a = 2;
        int b = 3;
        int res = calculator.multiplication(a, b);
        int exp = 6;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void division() {
        System.out.println("Test division");
        int a = 15;
        int b = 30;
        int res = calculator.division(a, b);
        int exp = 2;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void max() {
        System.out.println("Test max");
        int a = 30;
        int b = 20;
        int res = calculator.max(a, b);
        int exp = 30;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void min() {
        System.out.println("Test min");
        int a = 30;
        int b = 20;
        int res = calculator.min(a, b);
        int exp = 20;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void percentNumb() {
        System.out.println("Test percent number");
        int a = 50;
        int b = 10;
        int res = calculator.percentNumb(a, b);
        int exp = 5;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);
    }

    @Test
    public void raisePower() {
        System.out.println("Test raisePower");
        int a = 5;
        int b = 2;
        int res = (int) calculator.raisePower(a, b);
        int exp = 25;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res);


    }
}