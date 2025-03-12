//2.Zadatak - Napišite program koji iz metode main poziva metodu iscrtaj(x,y),
//gdje su x i y brojevi redaka i stupaca koje je potrebno ispisati na standardni izlaz.

package PripremaZaModulIspit;

public class Iscrtaj {
    public static void main(String[] args) {
        iscrtaj(10,10);
    }

    public static void iscrtaj(int x, int y) {
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < y; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < y; j++) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}