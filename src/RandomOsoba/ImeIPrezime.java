//13-02-2025

//Kreirati petlju koja će uzimati imena i prezimena i iskombinirati ih u random imena.

package RandomOsoba;

import java.util.ArrayList;
import java.util.Random;

public class ImeIPrezime {
    private ArrayList<String> imena;
    private ArrayList<String> prezimena;

    //Konstruktor
    public ImeIPrezime() {
        imena = new ArrayList<>();
        prezimena = new ArrayList<>();
    }

    //Metoda pomoću koje dodajemp ime u listu imena
    public void dodajIme(String ime) {
        imena.add(ime);
    }

    //Metoda pomoću koje dodajemo prezime u listu prezimena
    public void dodajPrezime(String prezime) {
        prezimena.add(prezime);
    }

    //Metoda za generiranje, te ispis random "imena + prezimena"
    public String ispisRandom() {
        Random random = new Random();
        String randomIme = imena.get(random.nextInt(imena.size()));
        String randomPrezime = prezimena.get(random.nextInt(prezimena.size()));
        return randomIme + " " + randomPrezime;
    }
}
