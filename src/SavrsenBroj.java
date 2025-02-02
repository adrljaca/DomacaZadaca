//DZ 30-01-2025

//Zadatak 1: Napišite program koji ispisuje je li uneseni broj savršen ili ne.
// Savršen broj je broj koji je jednak zbroju svojih djelitelja (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)
//Zadatak 2: Unijeti u program broj ocjena po želji, ispisati prosjek ocjena.

import java.util.Scanner;

public class SavrsenBroj {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1. Zadatak
        System.out.println("Unesite cijeli broj: "); //Unos broja
        int broj = input.nextInt();

        if (broj <= 0) { //Provjeravamo uvjet, ne želimo 0 i manje od 0
            System.out.println("Uneseni broj (" + broj + ") nije savršen broj!");
        } else {
            int suma = 0;

            for (int i = 1; i <= broj/2; i++) { //Tražimo djelitelja i dodajemo sumi
                if (broj % i == 0) {
                    suma += i;
                }
            }

            if (suma == broj) { //Provjeravamo je li suma djelitelja jednaka samome broju
                System.out.println("Broj " + broj +" je savršen broj.");
            } else {
                System.out.println("Broj " + broj +" nije savršen broj.");
            }
        }


        //2. Zadatak
        System.out.println("Unesite broj ocjena: "); //Koliko ocjena želimo unijeti?
        int kolicina = input.nextInt();
        double[] ocjene = new double[kolicina]; //Definiramo polje i dajemo mu veličinu koju smo kroz input unijeli

        //Pomoću petlje prolazimo kroz svaki element polja te unosimo željenu ocjenu
        for (int i = 0; i < kolicina; i++) {
            System.out.println("Unesite " + (i + 1) + ". ocjenu: ");
            ocjene[i] = input.nextDouble();
        }

        //Zbroj svih ocjena
        double suma = 0;
        for (double ocjena : ocjene) {
            suma += ocjena;
        }

        //Prosjek ocjena
        double prosjek = suma / kolicina;

        System.out.printf("Prosječna ocjena: %.2f%n", prosjek);
        input.close();
    }
}
