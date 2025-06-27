import java.util.Scanner;

public class App {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creazione di un oggetto Scanner
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine(); // Leggi una linea di testo
        System.out.println("Hai inserito: " + inputString);

        System.out.print("Inserisci un numero: ");
        Integer inputInt = scanner.nextInt(); // Leggi un numero
        System.out.println("Hai inserito: " + inputInt);
        scanner.close(); // Chiudi lo scanner per rilasciare le risorse
    }
}
