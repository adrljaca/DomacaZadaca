//DZ 17-02-2025

//Kreiraj klase Životinja, Pas, Mačka. Pas i Mačka nasljeđuju Životinja.
//Sve klase imaju naziv i metodu glasajSe. Svaka metoda vraća različiti
//zvuk glasanja. Kreiraj niz nekoliko različitih životinja i ispiši ih
//zajedno s glasom koji imaju.

package Zivotinja;

public class Zivotinja {
    String naziv;

    public Zivotinja(String naziv) {
        this.naziv = naziv;
    }

    public String glasajSe() {
        return "Životinja se glasa!";
    }
}

class Pas extends Zivotinja {
    public Pas(String naziv) {
        super(naziv);
    }

    @Override
    public String glasajSe() {
        return "Vau Vau";
    }
}

class Macka extends Zivotinja {
    public Macka(String naziv) {
        super(naziv);
    }

    @Override
    public String glasajSe() {
        return "Mjau Mjau";
    }
}

class Zaba extends Zivotinja {
    public Zaba(String naziv) {
        super(naziv);
    }

    @Override
    public String glasajSe() {
        return "Kre Kre";
    }
}

class Krava extends Zivotinja {
    public Krava(String naziv) {
        super(naziv);
    }

    @Override
    public String glasajSe() {
        return "Muu Muu";
    }
}

class Ovca extends Zivotinja {
    public Ovca(String naziv) {
        super(naziv);
    }

    @Override
    public String glasajSe() {
        return "Bee Bee";
    }
}