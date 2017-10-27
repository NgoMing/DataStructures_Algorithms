package DataStructure;

public class Utils {
	/*
	 * positive modulo
	 */
	public static int positiveModulos(int a, int b) {
		if (b == 0)
			throw new ArithmeticException();
		
		if (b < 0) {
			a = -a;
			b = -b;
		}
		return (((a % b) + b) % b);
	}
}
