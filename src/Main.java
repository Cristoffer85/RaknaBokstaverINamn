//Gör ett program som frågar efter ditt namn (eller en variabel som innehåller ditt namn).
//Ta reda på hur många bokstäver det finns i ditt namn (mellanslag inkluderad,
import java.util.Scanner;

public class Raknabokstaveriangivetnamn {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Vad är ditt namn? : ");
    String Namnfraga = scanner.nextLine();

        System.out.print("Ditt namn är " + Namnfraga + "och det är " + Namnfraga.length() + " bokstäver långt.");
    }
}
