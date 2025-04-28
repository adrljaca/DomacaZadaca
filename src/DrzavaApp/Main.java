//Napiši Java konzolnu aplikaciju sa sljedećim funkcionalnostima:
//        Korisniku se prikazuje izbornik sa sljedećim opcijama:
//        1 – nova država
//        2 - izmjena postojeće države
//        3 - brisanje postojeće države
//        4 – prikaz svih država sortiranih po nazivu
//        5 – kraj
//
//        Opcije 1 do 4 odnose se na CRUD operacije and tablicom Drzava u bazi AdventureWorks
//        Odabirom opcije 2 i 3, od korisnika je potrebno tražiti ID države koje želite izmijeniti ili pobrisati
//        Napomena: brišite i mijenjajte samo one države koje ste Vi ubacili (one za koje je IdDrzava veći od 3)

package DrzavaApp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database.connectToDatabase();

        Scanner scanner = new Scanner(System.in);
        int opcija;

        while (true) {
            System.out.println("\n----------Izbornik----------");
            System.out.println("\t1. Nova država");
            System.out.println("\t2. Izmjena države");
            System.out.println("\t3. Brisanje države");
            System.out.println("\t4. Prikaz svih država");
            System.out.println("\t5. Izlazak iz programa");
            System.out.println("-----------------------------");

            System.out.print("Odaberite opciju: ");
            opcija = scanner.nextInt();
            scanner.nextLine();

            try (Connection connection = Database.createDataSource().getConnection()) {
                switch (opcija) {
                    case 1:
                        System.out.print("Unesite naziv nove države: ");
                        String nazivDrzave = scanner.nextLine();
                        DrzavaMetode.dodajDrzavu(connection, nazivDrzave);
                        break;
                    case 2:
                        System.out.print("Unesite ID države koju želite izmijeniti: ");
                        int idDrzaveZaIzmjenu = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Unesite novi naziv države: ");
                        String noviNaziv = scanner.nextLine();
                        DrzavaMetode.izmijeniDrzavu(connection, idDrzaveZaIzmjenu, noviNaziv);
                        break;
                    case 3:
                        System.out.print("Unesite ID države koju želite obrisati: ");
                        int idDrzaveZaBrisanje = scanner.nextInt();
                        DrzavaMetode.obrisiDrzavu(connection, idDrzaveZaBrisanje);
                        break;
                    case 4:
                        System.out.println("\n-----Lista Država-----");
                        DrzavaMetode.prikaziDrzave(connection);
                        break;
                    case 5:
                        System.out.println("Izlazak iz programa.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Nepoznata opcija, pokušajte ponovo.");
                        break;
                }
            } catch (SQLException e) {
                System.err.println("Greška pri spajanju na bazu ili izvođenju operacije.");
                e.printStackTrace();
            }
        }
    }
}
