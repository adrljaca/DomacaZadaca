//DZ 17-02-2025

//Kreiraj klase Životinja, Pas, Mačka. Pas i Mačka nasljeđuju Životinja.
//Sve klase imaju naziv i metodu glasajSe. Svaka metoda vraća različiti
//zvuk glasanja. Kreiraj niz nekoliko različitih životinja i ispiši ih
//zajedno s glasom koji imaju.

package Zivotinja;

public class Glasanje {
    public static void main(String[] args) {
        Zivotinja pas = new Pas("Tony");
        Zivotinja macka = new Macka("Lilly");
        Zivotinja zaba = new Zaba("Kermit");
        Zivotinja krava = new Krava("Milka");
        Zivotinja ovca = new Ovca("Dolly");

        System.out.println(pas.naziv + " se glasa: " + pas.glasajSe());
        System.out.println(macka.naziv + " se glasa: " + macka.glasajSe());
        System.out.println(zaba.naziv + " se glasa: " + zaba.glasajSe());
        System.out.println(krava.naziv + " se glasa: " + krava.glasajSe());
        System.out.println(ovca.naziv + " se glasa: " + ovca.glasajSe());
    }
}
