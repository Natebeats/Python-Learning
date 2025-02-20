/**
 * 
 */
package day0402.car;

/**
 * @author fred
 *
 */
public class MainCar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car myCar = new Car("Blau", 120);  // Konstruktor aufrufen
		Car gCar = new Car("Grün", 10); 
		Car geparkteCar = new Car("Gelb", 0); 
		myCar.drive();
		gCar.drive();
		geparkteCar.drive();
	}

}
