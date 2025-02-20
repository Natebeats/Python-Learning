package day0402.car;

import java.time.Year;
import java.util.Objects;

/**
 * @author fred
 *
 */
public class Auto {
    private String marke;
    private String modell;
    private int baujahr;

    // Konstruktor
    public Auto(String marke, String modell, int baujahr) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    // Methode zur Anzeige der Details
    public void zeigeDetails() {
        System.out.println("Marke: " + marke);
        System.out.println("Modell: " + modell);
        System.out.println("Baujahr: " + baujahr);
    }

    // Methode zur Überprüfung, ob das Auto ein Oldtimer ist (älter als 30 Jahre)
    public boolean istOldtimer() {
        int aktuellesJahr = Year.now().getValue();
        return (aktuellesJahr - baujahr) > 30;
    }

    
    
    @Override
	public String toString() {
		return "Auto [marke=" + marke + ", modell=" + modell + ", baujahr=" + baujahr + "]";
	}

    

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return baujahr == other.baujahr && Objects.equals(marke, other.marke) && Objects.equals(modell, other.modell);
	}

	// Hauptmethode zum Testen der Klasse
    public static void main(String[] args) {
        Auto meinAuto = new Auto("VW", "Golf", 1994);
        meinAuto.zeigeDetails();

        Auto zweitwagen = meinAuto; // new Auto("VW", "Golf", 1994);
        
        if(zweitwagen == meinAuto ) {
        	System.out.println("Das Auto ist mein Zweitwagen.");
        } else {
        	System.out.println("Das Auto ist nicht mein Zweitwagen.");
        }
        
        if(zweitwagen.equals( meinAuto)) {
        	System.out.println("Das Auto ist mein Zweitwagen.");
        } else {
        	System.out.println("Das Auto ist nicht mein Zweitwagen.");
        }
        
        if (meinAuto.istOldtimer()) {
            System.out.println("Das Auto ist ein Oldtimer.");
        } else {
            System.out.println("Das Auto ist kein Oldtimer.");
        }
    }
}