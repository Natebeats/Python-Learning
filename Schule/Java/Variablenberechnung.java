public class Variablenberechnung {
    public static void main(String[] args) {
        int lieblingszahl = 7;
        double koerpergroesse = 1.75;
        char lieblingsbuchstabe = 'A';

        System.out.println("Lieblingszahl: " + lieblingszahl);
        System.out.println("Körpergröße: " + koerpergroesse);
        System.out.println("Lieblingsbuchstabe: " + lieblingsbuchstabe);

        final double LICHTGESCHWINDIGKEIT = 299792458;
        System.out.println("Lichtgeschwindigkeit: " + LICHTGESCHWINDIGKEIT);

        double radius = 5.0;
        double flaeche = Math.PI * radius * radius;
        System.out.println("Fläche eines Kreises mit Radius " + radius + ": " + flaeche);
    }
}