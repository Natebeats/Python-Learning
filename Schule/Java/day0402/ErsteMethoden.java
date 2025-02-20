/**
 * 
 */
package day0402;

/**
 * @author fred
 *
 */
public class ErsteMethoden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int result = add(5, 10);
		System.out.println("Die Summe ist: " + result);

		double doubleResult = add(5.0, 10.0);
		System.out.println("Die Summe (double) ist: " + doubleResult);

		String stringResult = add("Hello","world");
		System.out.println("Die Summe (String) ist: " + stringResult);

		String stringResult2 = concat("Hello","world");
		System.out.println("Die Summe (String2) ist: " + stringResult2);

	}
	
	
	private static int add(int a, int b) {
	    int sum = a + b;
	    return sum;
	}

	private static double add(double a, double b) {
		double sum = a + b;
	    return sum;
	}

	private static String add(String a, String b) {
		String sum = a + " " + b;
	    return sum;
	}
	
	public static String concat(String wert1, String wert2) {
		StringBuffer sb = new StringBuffer(wert1);
		sb.append(" ");
		sb.append(wert2);
		return sb.toString();
	}
	
}
