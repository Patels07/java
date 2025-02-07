public class eccezzione {
    public static void main(String[] args) {
        int numero = 10;
        int divisore = 0;

        try {
            int risultato = numero / divisore;
            System.out.println("Risultato: " + risultato);
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero.");
        }

        System.out.println("Esecuzione continuata normalmente.");
    }
}