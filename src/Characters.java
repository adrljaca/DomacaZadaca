import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        //Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje koliko ima slova,
        //koliko brojeva i koliko "ostalih znakova".
        //Koristiti clasu character!!!
        //Npr. ako je uneseni niz znakova "Danas je 27.02.2010.", program treba ispisati:
        //Slova: 7
        //Brojevi: 8
        //Ostali znakovi: 5

        //1. Zadatak
        Scanner sc = new Scanner(System.in);

        System.out.println("Upišite rečenicu: ");
        String unos = sc.nextLine();

        int brojevi = 0;
        int slova = 0;
        int znakovi = 0;

        for (int i = 0; i < unos.length(); i++) {
            char trenutniChar = unos.charAt(i);

            if (Character.isLetter(trenutniChar)) {
                slova++;
            } else if (Character.isDigit(trenutniChar)) {
                brojevi++;
            } else {
                znakovi++;
            }
        }

        System.out.println("Unesena rečenica ima:");
        System.out.println("\tSlova: " + slova);
        System.out.println("\tBrojeva: " + brojevi);
        System.out.println("\tZnakova: " + znakovi);
    }
}
