//DZ 13-02-2025

//Kreiraj klasu Proizvod koja se sastoji od 3 vrijednosti: naziv, cijena, količina.
//Kreiraj konstruktor i metodu za prikaz informacija o proizvodu "Naziv + cijena + količina"
//Program treba unositi proizvode u ArrayList ili List dok mu ne upišemo riječ za prekid unosa.
//Nakon prekida unosa, ispiši sve proizvode.

package Proizvodnja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Unosimo proizvode, njihovu cijenu i količinu, te ih dodajemo u listu proizvoda
        while (true) {
            System.out.println("Unesite proizvod (za prekidanje upišite 'prekid'): ");
            String naziv = sc.nextLine();

            if (naziv.equalsIgnoreCase("prekid")) {
                break;
            }

            System.out.println("Unesite cijenu za " + naziv + ": ");
            double cijena = sc.nextDouble();

            System.out.println("Unesite količinu " + naziv + ": ");
            int kolicina = sc.nextInt();
            sc.nextLine();

            Proizvod proizvod = new Proizvod(naziv, cijena, kolicina); //referenca na novokreirani objekt
            proizvodi.add(proizvod);
        }

        //Ispisujemo proizvode
        System.out.println("\n-----Ispis proizvoda-----");
        for (Proizvod proizvod : proizvodi) {
            System.out.println(proizvod.dohvatiProizvod());
        }

        sc.close();
    }
}
