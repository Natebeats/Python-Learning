import java.util.Scanner;

public class Frage {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Wie heißt du? ");
            String name = scanner.nextLine();
            System.out.println("Hallo, " + name + "!");
        }
    }
}
