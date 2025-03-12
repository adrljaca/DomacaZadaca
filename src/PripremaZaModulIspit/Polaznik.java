//3.Zadatak - Napravite klasu Polaznik sa sljedećim svojstvima: dob, ime, prezime.
//Tipove podataka odaberite sami. Klasa ne smije prema van izlagati varijable, već ih
//mora čuvatio kao privatne članove. U glavnom programu napravite 3 polaznika različite starosti,
//dodajte ih u kolekciju i sortirajte po godinama uzlazno, zatim ispišite.

package PripremaZaModulIspit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Polaznik implements Comparable<Polaznik> {
    private int dob;
    private String ime;
    private String prezime;

    public Polaznik(int dob, String ime, String prezime) {
        this.dob = dob;
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Dob: " + dob + "\t\tIme: " + ime + "\t\tPrezime: " + prezime;
    }

    @Override
    public int compareTo(Polaznik o) {
        return Integer.compare(dob, o.dob);
    }
}

class Main {
    public static void main(String[] args) {
        List<Polaznik> polaznici = new ArrayList<>();
        
        polaznici.add(new Polaznik(30, "Ivo", "Ivić"));
        polaznici.add(new Polaznik(37, "Pero", "Perić"));
        polaznici.add(new Polaznik(23, "Ana", "Anić"));

        Collections.sort(polaznici);

        for (Polaznik p : polaznici) {
            System.out.println(p);
        }
    }
}