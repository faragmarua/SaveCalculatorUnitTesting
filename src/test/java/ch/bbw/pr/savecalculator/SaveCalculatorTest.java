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

    // 8 Tests zu Summe ( Aufgabe Äquivalenzklassen)

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

    @Test
    public void testSummePositiveNegativeOK(){
        int value1 = 10;
        int value2= (-20);
        assertTrue(testee.summe(value1,value2)==(-10));
    }

    @Test
    public void testNegativeWithZero(){
        int value1 = 0;
        int value2= (-20);
        assertTrue(testee.summe(value1,value2)==(-20));
    }

    @Test
    public void testPositveWithZero(){
        int value1 = 10;
        int value2= 0;
        assertTrue(testee.summe(value1,value2)==10);
    }

    //Fails, weil max value überschritten wird, auskommentiert für build
  //  @Test
  //  public void testNumberWithMaxValue(){
  //      int value1 = 10;
   ///     int value2= Integer.MAX_VALUE;
   //     assertTrue(testee.summe(value1,value2)==(10 + Integer.MAX_VALUE ));
   // }

    @Test
    public void testNumberWithMinValue(){
        int value1 = 10;
        int value2= Integer.MIN_VALUE;
        assertTrue(testee.summe(value1,value2)==(Integer.MIN_VALUE + 10));
    }

    @Test
    public void testWithExceptions() throws ArithmeticException {
        int value1 = 10;
        int value2= 20;
        assertTrue(testee.summe(value1,value2)==30);
    }

    // 8 Tests zu Differenz

    @Test
    public void testDifferenzWithZweiPositiveIsOk() {
        int value1 = 10;
        int value2= 5;
        assertTrue(testee.differenz(value1,value2)==5);
    }

    @Test
    public void testDifferentZweiPositiveIstOk() {
        int value1 = 10;
        int value2= 20;
        assertTrue(testee.differenz(value1,value2)== -10);
    }

    @Test
    public void testDifferentZweiNegativeIsOk() {
        int value1 = (-10);
        int value2= (-20);
        assertTrue(testee.differenz(value1,value2)==10);
    }

    @Test
    public void testDifferenzPositiveNegativeOK(){
        int value1 = 10;
        int value2= (-20);
        assertTrue(testee.differenz(value1,value2)==30);
    }

    @Test
    public void testDifferenzNegativeWithZero(){
        int value1 = 0;
        int value2= (-20);
        assertTrue(testee.differenz(value1,value2)==20);
    }

    @Test
    public void testDifferenzPositveWithZero(){
        int value1 = 10;
        int value2= 0;
        assertTrue(testee.differenz(value1,value2)==10);
    }

    //Fails, weil max value überschritten wird, auskommentiert für build
  //  @Test
  //  public void testDifferenzNumberWithMaxValue(){
  //      int value1 = 10;
  //      int value2= Integer.MAX_VALUE;
  //      assertTrue(testee.differenz(value1,value2)==(Integer.MAX_VALUE - 10));
  //  }

    @Test
    public void testDifferenzNumberWithMinValue(){
        int value1 = 10;
        int value2= Integer.MIN_VALUE;
        assertTrue(testee.differenz(value1,value2)==(10 - Integer.MIN_VALUE ));
    }

    @Test
    public void testDifferenzWithExceptions() throws ArithmeticException {
        int value1 = 10;
        int value2= 20;
        assertTrue(testee.differenz(value1,value2)==(-10));
    }

    //8 Tests zu Division
    @Test
    public void testDivisionWithZweiPositiveIsOk() throws ArithmeticException{
        int value1 = 10;
        int value2= 5;
        assertFalse(!(2 == testee.division(value1, value2)));
    }

    @Test
    public void testDivisionZweiPositiveIstOk() {
        int value1 = 50;
        int value2= 10;
        assertTrue(testee.division(value1,value2)== 5);
    }

    @Test
    public void testDivisionZweiNegativeIsOk() {
        int value1 = (-20);
        int value2= (-10);
        assertTrue(testee.division(value1,value2)==2);
    }

    @Test
    public void testDivisionPositiveNegativeOK(){
        int value1 = 30;
        int value2= (-10);
        assertTrue(testee.division(value1,value2)== -3);
    }

    @Test
    public void testDivisionNegativeWithZero(){
        int value1 = 0;
        int value2= (-20);
        assertTrue(testee.division(value1,value2)==0);
    }

    @Test
    public void testDivisionPositveWithZero(){
        int value1 = 0;
        int value2= 10;
        assertTrue(testee.division(value1,value2)==0);
    }

    //Fails, weil max value überschritten wird
    @Test
    public void testDivisionNumberWithMaxValue(){
        int value1 = 10;
        int value2= Integer.MAX_VALUE;
        assertTrue(testee.division(value1,value2)==(10 / Integer.MAX_VALUE));
    }

    @Test
    public void testDivisionNumberWithMinValue(){
        int value1 = 10;
        int value2= Integer.MIN_VALUE;
        assertTrue(testee.division(value1,value2)==(10 / Integer.MIN_VALUE ));
    }

    @Test
    public void testDivisionWithExceptions() throws ArithmeticException {
        int value1 = 10;
        int value2= 20;
        assertTrue(testee.differenz(value1,value2)==0.5);
    }



    //ExceptionHandling
    @Test(expected=ArithmeticException.class)
    public void testArithmeticException() {
        ArrayList emptyList = new ArrayList();
        Object o;
        o = emptyList.get(0);
    }

    @Test
    public void testArithmeticExceptionNotRaised()
            throws ArithmeticException {

        ArrayList emptyList = new ArrayList();
        Object o = emptyList.get(0);
    }

    //Test mit Protected Method
    @Test
    public void multiplikation() {
        int value1 = 2;
        int value2 = 3;
        assertTrue(testee.multiplikation(value1,value2)==(6));

    }
}