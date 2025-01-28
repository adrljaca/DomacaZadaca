//DZ 27-01-2025

import java.util.Scanner;

public class PetljaWhileDZ {
    public static void main(String[] args) {

        //1. Zadatak
        System.out.println("|-----------1. Zadatak-----------|\nKorištenjem petlje while -> Izračunaj zbroj znamenaka unesenog broja. " +
                "'Npr. 351 zbroj znamenaka je 9.'");
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite neki broj: ");
        int broj = input.nextInt();
        int saveBr = broj;
        int suma = 0;
        while (broj > 0) {
            suma += broj % 10;
            broj /= 10;
        }
        System.out.println("Suma znamenki broja " + saveBr + " iznosi: " + suma + "\n");
        input.close();


        //2. Zadatak
        System.out.println("|-----------2. Zadatak-----------|\nKorištenjem petlje do-while " +
                "izračunaj zbroj brojeva od 1 do 1000 djeljivih sa 7.");
        int zbroj = 0;
        int brojac = 1;

        do {
            if (brojac % 7 == 0) {
                zbroj += brojac;
            }
            brojac++;
        } while (brojac <= 1000);
        System.out.println("Suma brojeva od 1 do 1000 koji su djeljivi sa 7 iznosi: " + zbroj);
    }
}
