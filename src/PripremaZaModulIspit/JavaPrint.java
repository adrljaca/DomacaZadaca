//1.Zadatak - Napišite Java program koji ispisuje na standardni izlaz sljedeće: JAVA

package PripremaZaModulIspit;

public class JavaPrint {
    public static void main(String[] args) {
        String[] polje = {
                "     J      a      v     v     a ",
                "     J    a   a     v   v    a   a",
                " J   J   aaaaaaa     V V    aaaaaaa",
                "  J J   a       a     V    a       a"
        };

        for (String p : polje) {
            System.out.println(p);
        }
    }
}