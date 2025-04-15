package Pocetno;//DZ 10-02-2025

//Uzeti bilo koja dva zadataka iz prethodnih zadaća i preoblikovati rješenje da se koriste metode.

import java.util.Scanner;

public class Metode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Zadatak
        while (true) {
            System.out.print("Unesite prirodni broj: ");
            int broj = sc.nextInt();
            if (broj <= 0) {
                System.out.println("Nije unesen prirodan broj!");
            } else {
                System.out.println("Savršen broj(" + broj + ")? " + isSavrsenBroj(broj));
                break;
            }
        }

        System.out.println("-------------------------------");

        //2. Zadatak
        System.out.print("Unesite iznos(€): ");
        double iznos = sc.nextDouble();
        Blagajna(iznos);
    }


    //1. Zadatak - Savršen broj - broj koji je jednak zbroju svojih djelitelja (bez njega samoga).
    public static boolean isSavrsenBroj (int br) {
        int suma = 0;
        for(int i = 1; i <= br/2; i++) { //Tražimo djelitelja i dodajemo sumi
            if (br % i == 0) {
                suma += i;
            }
        }
        return suma == br; //Ako je savršen vraća true, ako nije onda false
    }


    //2. Zadatak - Pocetno.Blagajna - program koji učitava iznos u eurima koji prodavačica treba uzvratiti klijentu.
    public static void Blagajna (double iznos) {
        double[] euri = {500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00,
                2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        int pretvorbaIznosa = (int) Math.round(iznos * 100); //Iznos pretvaramo u cente

        System.out.println("Za vratiti:");

        for (double euro : euri) {
            int pretvorbaPolja = (int) Math.round(euro * 100); //Pretvaranje elemenata polja u cente
            int brojac = pretvorbaIznosa / pretvorbaPolja;
            if (brojac > 0) {
                System.out.println(brojac + " * " + euro + "€");
                pretvorbaIznosa %= pretvorbaPolja;
            }
        }
    }
}