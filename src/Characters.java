//DZ 05-02-2025

import java.util.Scanner;

public class Characters {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //1. Zadatak
        //Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje koliko ima slova,
        //koliko brojeva i koliko "ostalih znakova".
        //Koristiti clasu character!!!
        //Npr. ako je uneseni niz znakova "Danas je 27.02.2010.", program treba ispisati:
        //Slova: 7
        //Brojevi: 8
        //Ostali znakovi: 5

        System.out.println("Upišite rečenicu: ");
        String unos = sc.nextLine();

        int brojevi = 0;
        int slova = 0;
        int znakovi = 0;

        for (int i = 0; i < unos.length(); i++) {
            char c = unos.charAt(i);

            if (Character.isLetter(c)) {
                slova++;
            } else if (Character.isDigit(c)) {
                brojevi++;
            } else if (c == '.' || c == ',' || c == '?' || c == '"' || c == '!' || c == '-') {
                znakovi++;
            }
        }

        System.out.println("Unesena rečenica ima:");
        System.out.println("\tSlova: " + slova);
        System.out.println("\tBrojeva: " + brojevi);
        System.out.println("\tZnakova: " + znakovi);

        //2. Zadatak
        //Napišite program u Javi koji će učitati niz znakova (string) sa standardnog
        //ulaza i okrenuti redoslijed riječi u unesenom stringu. Prikazati transformirani
        //string s obrnutim redoslijedom riječi.
        //Primjer ulaza: Dobar dan svima
        //Primjer izlaza: svima dan Dobar

        System.out.println("Unesite nekakav string znakova: ");
        String input = sc.nextLine();

        String[] rijeci = input.split(" ");

        for (int i = rijeci.length - 1; i >= 0; i--) {
            System.out.print(rijeci[i] + " ");
        }
    }
}
