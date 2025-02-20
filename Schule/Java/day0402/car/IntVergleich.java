package day0402.car;

public class IntVergleich {
	public static void main(String[] args) {
// von -128 bis 127 // 
		Integer wert1 = 1000;
		Integer wert2 = 999;
		
//		wert2 = wert2+1;
		System.out.println("werte1 =  " + wert1);
		System.out.println("werte2 =  " + wert2);
		if(wert1.equals(wert2)) {
			System.out.println("werte sind gleich");
		} else {
			System.out.println("werte sind ungleich");
		}

		wert2 = wert2+1;
		System.out.println("werte1 =  " + wert1);
		System.out.println("werte2 =  " + wert2);
		if(wert1.equals(wert2)) {
			System.out.println("werte sind gleich");
		} else {
			System.out.println("werte sind ungleich");
		}
		wert2 = wert2+1;
		System.out.println("werte1 =  " + wert1);
		System.out.println("werte2 =  " + wert2);
		if(wert1.equals(wert2)) {
			System.out.println("werte sind gleich");
		} else {
			System.out.println("werte sind ungleich");
		}

	}
}
