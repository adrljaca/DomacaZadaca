package Polaznik;

/*Napiši program za evidenciju polaznika na tečaju. Program treba omogućiti unos polaznika i njihovih podataka te pružiti osnovne funkcije za upravljanje evidencijom.
Napravi klasu Polaznik koja ima sljedeće atribute:
* Ime polaznika
* Prezime polaznika
* E-mail adresa polaznika
Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu.
* Omogući korisniku unos novih polaznika (ime, prezime, e-mail).
* Omogući ispis svih polaznika na tečaju.
* Omogući pretraživanje polaznika po e-mail adresi.
Za rješavanje koristite klasu ArrayList */

import java.util.ArrayList;
import java.util.Scanner;

public class EvidencijaPolaznika {
    public static void main(String[] args) {
        ArrayList<Polaznik> listaPolaznika = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Izbornik:");
            System.out.println("1. Dodavanje novog polaznika");
            System.out.println("2. Ispis svih polaznika");
            System.out.println("3. Pretraga polaznika po e-mailu");
            System.out.println("4. Izlaz iz izbornika");

            System.out.print("Unesite opciju:");
            int opcija = scanner.nextInt();
            scanner.nextLine();

            if (opcija == 1) {
                System.out.print("Unesite ime: ");
                String ime = scanner.nextLine();
                System.out.print("Unesite prezime: ");
                String prezime = scanner.nextLine();
                System.out.print("Unesite e-mail: ");
                String email = scanner.nextLine();

                listaPolaznika.add(new Polaznik(ime, prezime, email));
                System.out.println("Polaznik dodan u listu!");
            } else if (opcija == 2) {
                System.out.println("\n-----List polaznika-----");
                if (listaPolaznika.isEmpty()) {
                    System.out.println("Nema polaznika u listi!");
                } else {
                    for (Polaznik p : listaPolaznika) {
                        System.out.println(p);
                    }
                }
            } else if (opcija == 3) {
                System.out.print("Unesite e-mail adresu polaznika: ");
                String pretraga = scanner.nextLine();
                boolean pronaden = false;

                for (Polaznik p : listaPolaznika) {
                    if (p.getEmail().equalsIgnoreCase(pretraga)) {
                        System.out.println("Polaznik: " + p + "\n");
                        pronaden = true;
                    }
                }

                if (!pronaden) {
                    System.out.println("Polaznik s tim e-mailom ne postoji!\n");
                }
            } else if (opcija == 4) {
                System.out.println("Izlaz iz programa.\n");
                break;
            } else {
                System.out.println("Nepoznata opcija! Pokušajte ponovo.\n");
            }
        }
    }
}