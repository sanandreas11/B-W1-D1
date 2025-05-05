import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perimetro rettangolo
        System.out.print("Inserisci il primo lato del rettangolo: ");
        double lato1 = scanner.nextDouble();
        System.out.print("Inserisci il secondo lato del rettangolo: ");
        double lato2 = scanner.nextDouble();
        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Perimetro del rettangolo: " + perimetro);

        // Verifica pari/dispari
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("0 = pari, 1 = dispari → Risultato: " + risultatoPariDispari);

        // Area triangolo
        System.out.print("Inserisci il primo lato del triangolo: ");
        double a = scanner.nextDouble();
        System.out.print("Inserisci il secondo lato del triangolo: ");
        double b = scanner.nextDouble();
        System.out.print("Inserisci il terzo lato del triangolo: ");
        double c = scanner.nextDouble();
        double area = perimetroTriangolo(a, b, c);
        System.out.println("Area del triangolo: " + area);

        scanner.close();
    }
    // Metodo per calcolare il perimetro di un rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo per determinare se un numero è pari o dispari
    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    // Metodo per calcolare l'area di un triangolo (formula di Erone)
    public static double perimetroTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2; // semiperimetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // formula di Erone
    }

}