/**
 * 
 */
package day0302;

import java.util.Scanner;

/**
 * @author fred
 *
 */
public class PositivNegativ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("bitte eine Zahl: ");
		int zahl = scanner.nextInt();
		if (zahl == 0) {
			System.out.println("null");
		} else if (zahl < 0) {
			System.out.println("kleiner null");

		} else {
			System.out.println("groesser null");

		}
		
		switch((int)Math.signum((double)zahl)) {
		case 0:
			System.out.println("null");
			break;
		case -1:
			System.out.println("kleiner null");

			break;
		case 1:
			System.out.println("groesser null");
			break;
		}
	}

}
