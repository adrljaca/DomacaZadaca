package KopirajDatoteku;

import java.io.*;

public class Kopiraj {
    public static void main(String[] args) {

        //Definirali smo BufferedReader unutar () da ne moramo .close koristiti poslije
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            //Pitamo korisnika da unese putanju originalne datoteke, te spremamo putanju
            System.out.print("Unesite putanju do originalne datoteke: ");
            String original = read.readLine();

            //Pitamo korisnika da unese putanju kopirane datoteke
            System.out.print("Unesite naziv kopirane datoteke: ");
            String kopija = read.readLine();

            //Pokrećemo metodu kopirajDatoteku();
            kopirajDatoteku(original, kopija);

            //While radi dok korisnik ne unese D ili N
            while (true) {
                System.out.print("Želite li izbrisati kopiju datoteke (D/N)? ");
                String obrisati = read.readLine();

                //Ako je D onda brišemo datoteku i završavamo sa programom
                if ("D".equalsIgnoreCase(obrisati)) {
                    obrisiDatoteku(kopija);
                    System.out.println("Datoteka '" + kopija + "' izbrisana.");
                    System.out.println("Program dovršen!");
                    break;
                //Ako je N onda ostavljamo datoteku i završavamo sa programom
                } else if ("N".equalsIgnoreCase(obrisati)) {
                    System.out.println("Program dovršen!");
                    break;
                } else {
                    System.out.println("Pogrešan unos!");
                }
            }

        } catch (IOException e) {
            System.out.println("Pogreška: " + e.getMessage());
        }
    }

    //Metoda za kopiranje datoteke
    public static void kopirajDatoteku(String original, String kopija) {

        //Definiramo tokove unutar try ()
        try (FileInputStream ulaz = new FileInputStream(original);
             FileOutputStream izlaz = new FileOutputStream(kopija)) {

            int data;

            //Učitavamo i kopiramo byte po byte iz datoteke u datoteku
            while ((data = ulaz.read()) != -1) {
                izlaz.write(data);
            }

            System.out.println("Datoteka uspješno kopirana.");

        } catch (FileNotFoundException e) {
            System.out.println("Datoteka nije pronađena: " + original);
        } catch (IOException e) {
            System.out.println("Pogreška: " + e.getMessage());
        }
    }

    //Metoda za brisanje datoteke
    public static void obrisiDatoteku(String kopija) {
        File kopirano = new File(kopija);

        //Provjeravamo je li postoji kopirana datoteka i ukoliko postoji ju brišemo
        if (kopirano.exists()) {
            boolean obrisano = kopirano.delete();
            if (!obrisano) {
                System.out.println("Nije moguće obrisati datoteku.");
            }
        } else {
            System.out.println("Kopirana datoteka ne postoji.");
        }
    }
}