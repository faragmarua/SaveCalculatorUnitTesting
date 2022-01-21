package ch.bbw.pr.savecalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrivateTest {

    private SaveCalculator testee = new SaveCalculator();


    @Before
    public void executedBeforeEach() {
        SaveCalculator testee = new SaveCalculator();

    }

    //Versucht reflection umzusetzen, funktioniert leider noch nicht
    //Um die Äquvalenzklassen Tests zu implementieren musst ich die Methode
    //von private wider auf public setzen
    @Test
    public void testDividendWorks() throws Exception {

        Method divisionMethod = SaveCalculator.class.getDeclaredMethod("division", int.class, int.class);
        divisionMethod.setAccessible(true);
        int value1 = (int)  divisionMethod.invoke(SaveCalculator.class, 10);
        int value2= (int)  divisionMethod.invoke(SaveCalculator.class, 2);
        String returnValue = (String) divisionMethod.invoke(testee, value1, value2);
        //assertTrue(testee.division(value1,value2)==12);
        assertEquals(returnValue, 0.2);
    }

}
