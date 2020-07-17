package june_lu_kim.task1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WorkWithFractionsTest {
    WorkWithFractions workWithFractions = new WorkWithFractions();

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
        double a = 3.5;
        double b = 1.2;
        double res = workWithFractions.sum(a, b);
        double exp = 4.7;
        double delta = 0.01;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res, delta);
    }

    @Test
    public void subtraction() {
        System.out.println("Test subtraction");
        double a = 1.2;
        double b = 3.5;
        double res = workWithFractions.subtraction(a, b);
        double exp = 2.3;
        double delta = 0.01;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res, delta);
    }

    @Test
    public void multiplication() {
        System.out.println("Test multiplication");
        double a = 3.5;
        double b = 1.2;
        double res = workWithFractions.multiplication(a, b);
        double exp = 4.2;
        double delta = 0.01;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res, delta);
    }

    @Test
    public void division() {
        System.out.println("Test division");
        double a = 0.2;
        double b = 5;
        double res = workWithFractions.division(a, b);
        double exp = 25.0;
        double delta = 0.01;
        System.out.println("Result: " + exp);
        Assert.assertEquals(exp, res, delta);
    }
}