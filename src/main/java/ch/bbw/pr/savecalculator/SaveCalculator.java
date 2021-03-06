package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht.
 *   
 * @author Peter Rutschmann
 * @version 0.0.1
 */
public class SaveCalculator {
	public int summe(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 + (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}


	public int differenz(int minuend, int subtrahend) throws ArithmeticException {
		long value = (long) minuend - (long) subtrahend;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return minuend - subtrahend;
	}

	//Unit Test in file PrivateTest
	public double division(int dividend, int divisor) throws ArithmeticException {
		long value = (((long) dividend) / ((long) divisor));
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE) ) {
			throw new ArithmeticException();
		}
		return dividend / divisor;
	}


	protected double multiplikation(int faktor1, int faktor2) throws ArithmeticException {
		long value = (long) faktor1 * (long) faktor2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return faktor1 * faktor2;
	}
}



