/**
 * 
 */
package day0402.car;

/**
 * @author fred
 *
 */
public class Car {
    private String color;
    private int speed;

    // Konstruktor
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        if(speed == 0) {
        	System.out.println("Das Auto mit der Farbe " + color + " ist geparkt ");
        	
        } else {
        	System.out.println("Das Auto mit der Farbe " + color + " fährt mit " + speed + " km/h.");
        }
    }
        
}
