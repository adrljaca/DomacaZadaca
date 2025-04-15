package Pocetno;//DZ 03-02-2025

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Blagajna {
    public static void main(String[] args) {
        //1. Zadatak
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
        Scanner unos = new Scanner(System.in);

        double[] euri = {500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00,
                2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        System.out.print("Unesite iznos(€): ");
        double iznos = unos.nextDouble();

        int iznosCenti = (int) Math.round(iznos * 100); //Uneseni iznos pretvaramo u cente

        System.out.println("Za vratiti: ");

        for (double euro : euri) {
            int pretvorba = (int) Math.round(euro * 100); //Pretvaranje elemenata polja u cente
            int brojac = iznosCenti / pretvorba;
            if (brojac > 0) {
                System.out.println(brojac + " * " + euro + "€");
                iznosCenti %= pretvorba;
            }
        }


        //2. Zadatak
        //Napisati program koji će omogućiti korisniku unos niza cijelih brojeva
        //Program treba pronaći i ispisati najmanji i najveći broj u nizu
        List<Integer> brojevi = new ArrayList<>();

        System.out.print("Unesite cijeli broj ili riječ 'kraj' za završetak: ");

        while (true) {
            String vrijednost = unos.nextLine();
            if(vrijednost.equalsIgnoreCase("kraj")) { //Ako je unesena riječ 'kraj' izlazimo iz while-a
                break;
            }

            try { //Ukoliko korisnik unese krivu vrijednost tj. ne unese niti cijeli broj, niti riječ 'kraj'
                int broj = Integer.parseInt(vrijednost);
                brojevi.add(broj);
            } catch (NumberFormatException e) {
                System.out.println("Unesena je kriva vrijednost!");
            }

            System.out.print("Unesite broj ili riječ 'kraj': ");
        }

        if (brojevi.isEmpty()) { //Provjeravamo je li lista ima elemente
            System.out.println("U listi nema brojeva!");
            return; //Završavamo program pošto je lista prazna
        } else { //ako ima ispisujemo listu
            System.out.println("Lista brojeva: " + brojevi);
        }

        int max = brojevi.get(0); //Dohvaćamo 1. element liste, jer pretpostavljamo da će prvi unesen broj biti najveći
        int min = brojevi.get(0); //Dohvaćamo 1. element liste, jer pretpostavljamo da će prvi unesen broj biti najmanji

        for (int broj : brojevi) {  //Prolazimo kroz listu, te provjeravamo vrijednosti
            if (broj > max) {
                max = broj; //ako je broj iz liste veći od max, onda je vrijednost broja jednaka max-u
            }
            if (broj < min) {
                min = broj; //ako je broj iz liste manji od min, onda je vrijednost broja jednaka min-u
            }
        }

        System.out.println("Najveći broj: " + max);
        System.out.println("Najmanji broj: " + min);

        unos.close();
    }
}