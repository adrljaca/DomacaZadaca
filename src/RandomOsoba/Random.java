//13-02-2025

//Kreirati petlju koja će uzimati imena i prezimena i iskombinirati ih u random imena.

package RandomOsoba;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImeIPrezime osoba = new ImeIPrezime();

        //Unos imena i dodavanje u listu
        System.out.println("Unesite ime (za prekidanje upišite 'prekid')");
        while (true) {
            System.out.print("Unesite ime: ");
            String ime = sc.nextLine();
            if (ime.equalsIgnoreCase("prekid")) {
                System.out.println();
                break;
            }
            osoba.dodajIme(ime);
        }

        //Unos prezimena i dodavanje u listu
        System.out.println("Unesite prezime (za prekidanje upišite 'prekid')");
        while (true) {
            System.out.print("Unesite prezime: ");
            String prezime = sc.nextLine();
            if (prezime.equalsIgnoreCase("prekid")) {
                System.out.println();
                break;
            }
            osoba.dodajPrezime(prezime);
        }

        //Koliko osoba želimo generirati
        int broj = 0;
        do {
            System.out.print("Koliko osoba želite generirati? ");
            broj = sc.nextInt();
        } while (broj <= 0);
        System.out.println();

        //Ispis
        System.out.println("-----Generiranje " + broj + " osoba-----");
        String prijasnjaKomb = ""; //Spremamo prijašnju kombinaciju
        for (int i = 0; i < broj; i++) {
            String kombinacija;
            do {
                kombinacija = osoba.ispisRandom();
            } while (kombinacija.equals(prijasnjaKomb)); //Provjeravamo je li se ponavlja kombinacija

            System.out.println(kombinacija);
            prijasnjaKomb = kombinacija;
        }

        sc.close();
    }
}
