public class Esercizio1 {

    public static void main(String[] args) {
        // 1. Moltiplicazione
        int somma = moltiplica(4, 5);
        System.out.println("Risultato: " + somma);

        // 2. Concatenazione
        String frase=concatena("hello"," world");
        String risultatoConcatenazione = concatena("Risultato: ", frase);
        System.out.println(risultatoConcatenazione);

        // 3. Inserimento in array
        String[] arrayOriginale = {"uno", "due", "tre", "quattro", "cinque"};
        String[] arrayModificato = inserisciInArray(arrayOriginale, risultatoConcatenazione);

        System.out.println("Array modificato:");
        for (String elemento : arrayModificato) {
            System.out.println(elemento);
        }
    }

    public static int moltiplica(int a, int b) {
        return a * b;
    }

    // Metodo che concatena una stringa e un intero
    public static String concatena(String s, String n) {
        return s + n;
    }

    // Metodo che inserisce una stringa in un array di stringhe
    public static String[] inserisciInArray(String[] array, String nuovaStringa) {
        String[] nuovoArray = new String[6];
        // Copia i primi due elementi
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        // Inserisce la nuova stringa al terzo posto (indice 2)
        nuovoArray[2] = nuovaStringa;
        // Sposta gli elementi 2, 3, 4 dell'array originale in posizione 3, 4, 5
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

}

