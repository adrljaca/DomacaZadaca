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
            System.out.println("\n|-------------Izbornik-------------|");
            System.out.println("\t1.Dodavanje novog polaznika");
            System.out.println("\t2.Ispis svih polaznika");
            System.out.println("\t3.Pretraga polaznika po e-mailu");
            System.out.println("\t4.Izlaz iz izbornika");
            System.out.println("|----------------------------------|");

            System.out.print("Unesite opciju: ");
            int opcija = scanner.nextInt();
            scanner.nextLine();

            switch (opcija) {
                case 1:
                    System.out.print("Unesite ime: ");
                    String ime = scanner.nextLine();
                    System.out.print("Unesite prezime: ");
                    String prezime = scanner.nextLine();
                    System.out.print("Unesite e-mail: ");
                    String email = scanner.nextLine();

                    listaPolaznika.add(new Polaznik(ime, prezime, email));
                    System.out.println("Polaznik dodan u listu.\n");
                    break;
                case 2:
                    System.out.println("\n|----------Lista Polaznika----------|");
                    if (listaPolaznika.isEmpty()) {
                        System.out.println("\t   Nema polaznika u listi!");
                    } else {
                        for (Polaznik p : listaPolaznika) {
                            System.out.println("\t" + p);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Unesite e-mail adresu polaznika: ");
                    String pretraga = scanner.nextLine();
                    boolean pronaden = false;

                    for (Polaznik p : listaPolaznika) {
                        if (p.getEmail().equalsIgnoreCase(pretraga)) {
                            System.out.println("Pronađen polaznik " + p + "\n");
                            pronaden = true;
                        }
                    }

                    if (!pronaden) {
                        System.out.println("Ne postoji polaznik sa navedenim e-mailom.");
                    }
                    break;
                case 4:
                    System.out.println("Izlaz iz programa!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Nepoznata opcija. Pokušajte ponovo!");
            }
        }
    }
}