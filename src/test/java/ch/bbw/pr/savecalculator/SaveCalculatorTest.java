package ch.bbw.pr.savecalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaveCalculatorTest {

    @Test
    public void testSummeZweiPositiveIstOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2= 20;
        assertTrue(testee.summe(value1,value2)==30);
    }

    @Test
    public void testSummeZweiNegativeIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = (-10);
        int value2= (-20);
        assertTrue(testee.summe(value1,value2)==(-30));
    }

    @Test
    public void testDifferenzWithZweiPositiveIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2= 5;
        assertTrue(testee.differenz(value1,value2)==5);
    }
}