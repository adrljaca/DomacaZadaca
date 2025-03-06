//Kreiraj novu datoteku u kojoj se nalazi tekst: Pero;Marica;Ivica;Dodo;Ivana

//Korištenjem BufferedReadera učitaj podatke iz dateke u novu listu,
//kreiraj novo polje String[] koje će sadržavati imena.
//Ispiši imena iz polja
//Implementiraj try-catch

package DohvatiImeBuffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DohvatiIme {
    public static void main(String[] args) {

        try (BufferedReader read = new BufferedReader(new FileReader("Imena.txt"))){
            String ucitajLiniju = read.readLine();

            if (ucitajLiniju != null) {
                String[] poljeImena = ucitajLiniju.split(";");

                for (String ime : poljeImena) {
                    System.out.println(ime);
                }
            }

        } catch (IOException e) {
            System.out.println("Greška: " + e.getMessage());
        }
    }
}