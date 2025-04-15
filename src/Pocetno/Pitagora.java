package Pocetno;//DZ 22-01-2025
import java.util.Scanner;

public class Pitagora {
    public static void main(String[] args) {

        //1. Zadatak
        int x = 4;
        int y = 2;
        int z = x + y;

        System.out.println("-------------1. Zadatak-------------\n");
        System.out.printf("Zbroj broja %d + %d = %d\n", x,y,z);

        //2. Zadatak
        String ime = "Arijan";
        String prezime = "Drljača";
        String mjesto = "Osijek";

        System.out.println("\n-------------2. Zadatak-------------\n");
        System.out.println("\tIme: " + ime + "   Prezime: " + prezime + "\n\n\t\t  Mjesto: " + mjesto);

        //3. Zadatak
        Scanner unos = new Scanner(System.in);

        System.out.println("\n-------------3. Zadatak-------------\n");
        System.out.println("Unesite vrijednost A katete: ");
        double a = unos.nextDouble();
        System.out.println("Unesite vrijednost B katete: ");
        double b = unos.nextDouble();
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("Vrijednost hipotenuze C iznosi: %.2f%n", c);
        System.out.println("\n------------------------------------");

        unos.close();
    }
}
