package ch.bbw.pr.savecalculator;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import static org.junit.Assert.*;

public class SaveCalculatorTest {

    //Protected Methods: Place your tests in the same package as the classes under test.
    //Private Methods: Testing private methods may be an indication that those methods should be moved into another class to promote reusability.


    private SaveCalculator testee = new SaveCalculator();


    @Before
    public void executedBeforeEach() {
        SaveCalculator testee = new SaveCalculator();

    }

    @Test
    public void testSummeZweiPositiveIstOk() {
        int value1 = 10;
        int value2= 20;
        assertTrue(testee.summe(value1,value2)==30);
    }

    @Test
    public void testSummeZweiNegativeIsOk() {
        int value1 = (-10);
        int value2= (-20);
        assertTrue(testee.summe(value1,value2)==(-30));
    }

    //ExceptionHandling
    @Test(expected=ArithmeticException.class)
    public void testArithmeticException() {
        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }

    @Test
    public void testArithmeticExceptionNotRaised()
            throws ArithmeticException {

        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }



    @Test
    public void testDifferenzWithZweiPositiveIsOk() {
        int value1 = 10;
        int value2= 5;
        assertTrue(testee.differenz(value1,value2)==5);
    }

    @Test
    public void multiplikation() {
        int value1 = 2;
        int value2 = 3;
        assertTrue(testee.multiplikation(value1,value2)==(6));

    }
}