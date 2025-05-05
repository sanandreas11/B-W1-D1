import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inserimento di 3 stringhe da tastiera
        System.out.print("Inserisci la prima stringa: ");
        String s1 = scanner.nextLine();
        System.out.print("Inserisci la seconda stringa: ");
        String s2 = scanner.nextLine();
        System.out.print("Inserisci la terza stringa: ");
        String s3 = scanner.nextLine();

        // Concatenazione in ordine di inserimento
        String concatenazioneDiretta = s1 + s2 + s3;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneDiretta);

        // Concatenazione in ordine inverso
        String concatenazioneInversa = s3 + s2 + s1;
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa);

        scanner.close();
    }
}
