//DZ 29-01-2025

//Napišite program koji ispisuje sve Armstrongove brojeve manje od 10000.
//Armstrongovi brojevi su brojevi koji su jednaki sumi kubova svojih znamenaka.
//Ako je broj četveroznamenkast onda umjesto na treću, ide svaka znamenka na 4.
//Npr. 153 je Armstrongov broj jer vrijedi 153=1(3)+5(3)+3(3)
//Preskočiti 1 i 2

public class ArmstrongoviBrojevi {
    public static void main(String[] args) {

        System.out.print("Armstrongovi brojevi: ");

        for (int i = 1; i < 10000; i++) { //Prolazak kroz brojeve (od 1 do 10000)
            if (i == 1 || i == 2) {
                continue; //Preskočiti 1 i 2
            }

            int brZnam = 0;
            int n = i;
            while (n > 0) { //Provjeravamo broj znamenki, tako sto dijelimo broj dok ne bude 0
                n /= 10;
                brZnam++;
            }

            int suma = 0;
            n = i;
            while (n > 0) {
                int znamenka = n % 10; //Uzimamo zadnju znamenku
                n /= 10; //Uklanjamo zadnju znamenku
                suma += Math.pow(znamenka, brZnam); //Suma znamenki na potenciju broja znamenki
            }

            if (suma == i) {
                System.out.print(i + ", ");
            }
        }
    }
}
