//DZ 03-02-2025

import java.util.Scanner;

public class Blagajna {
    public static void main(String[] args) {
        //Napišite program koji učitava broj koji predstavlja iznos u eurima koji prodavačica treba uzvratiti klijentu.
        //(Demo klase Scanner) Prodavačica uvijek uzvraća u najvećim novčanicama (kovanicama).
        //Program treba ispisati u koliko kojih novčanica (kovanica) treba uzvratiti.
        //Novčanice eura imaju vrijednost 500, 200, 100, 50, 20, 10 i 5 eura,
        //a kovanice su od 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02 i 0.01 eura.
        //Morate uzvratiti:
        //3*500
        //2*200
        //1*50
        //1*20
        //1*5
        //1*2
        //1*1
        //double iznos = Double.parseDouble(SCANNER)

        int[] novcanica = {500, 200, 100, 50, 20, 10, 5};
        double[] kovanica = {2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite iznos(€): ");
        double iznos = sc.nextDouble();

        int ukupnoCenti = (int) Math.round(iznos * 100);

        System.out.println("Za vratiti: ");

        for (int novac : novcanica) {
            int brojac = ukupnoCenti / (novac * 100);
            if (brojac > 0) {
                System.out.println(brojac + " * " + novac + "€");
                ukupnoCenti -= brojac * novac * 100;
            }
        }

        for (double novac : kovanica) {
            int brojac = ukupnoCenti / (int) (novac * 100);
            if (brojac > 0) {
                System.out.println(brojac + " * " + novac + "€");
                ukupnoCenti -= brojac * (int) (novac * 100);
            }
        }
    }
}