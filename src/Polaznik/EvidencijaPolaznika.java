/*Napiši program za evidenciju polaznika na tečaju koji osigurava jedinstvenost e-mail adresa polaznika.
Program treba omogućiti unos polaznika i njihovih podataka te provjeriti jesu li e-mail adrese jedinstvene.
* Koristi klasu Polaznik s atributima: ime, prezime i e-mail
* Koristi HashMap<String, Polaznik> za pohranu polaznika, gdje će ključ biti e-mail adresa, a vrijednost objekt klase Polaznik.
        * Napravi glavnu klasu EvidencijaPolaznika koja sadrži main metodu.
        * Omogući korisniku unos novih polaznika (ime, prezime, e-mail).
        * Pri dodavanju novog polaznika, provjeri je li e-mail adresa već prisutna u evidenciji polaznika.
        * Ako je e-mail adresa već prisutna, ispiši odgovarajuću poruku i ne dopusti unos polaznika s istom e-mail adresom.
        * Omogući ispis svih polaznika na tečaju nakon unosa.

Što bi trebalo izmijeniti u rješenju ako dodamo novi zahtjev?
        * Svi polaznici moraju biti cijelo vrijeme sortirani po emailu uzlazno
*/

package Polaznik;

import java.util.HashMap;
import java.util.Scanner;

public class EvidencijaPolaznika {
    public static void main(String[] args) {
        HashMap<String, Polaznik> polaznici = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        boolean radi = true;

        while (radi) {
            System.out.print("Želite li unijeti novog polaznika? (Da/Ne): ");
            String opcija = scan.nextLine();

            if (opcija.equalsIgnoreCase("da")) {
                System.out.print("Unesite ime: ");
                String ime = scan.nextLine();

                System.out.print("Unesite prezime: ");
                String prezime = scan.nextLine();

                System.out.print("Unesite email: ");
                String email = scan.nextLine();

                if (polaznici.containsKey(email)) {
                    System.out.println("Taj email je postojeći! Unesite novi email.");
                } else {
                    Polaznik polaznik = new Polaznik(ime, prezime, email);
                    polaznici.put(email, polaznik);
                    System.out.println("Polaznik uspješno unešen.");
                }
            } else if (opcija.equalsIgnoreCase("ne")) {
                radi = false;
            } else {
                System.out.println("Molimo odaberite Da ili Ne opciju.");
            }
        }

        System.out.println("\nLista svih polaznika");
        for (Polaznik p : polaznici.values()) {
            System.out.println(p);
        }

        scan.close();
    }
}