import java.util.Scanner;

public class ArmstrongoviBrojevi {
    public static void main(String[] args) {
        //Armstrongovi brojevi su brojevi koji su jednaki sumi kubova svojih znamenki -za manje od 10000
        //Npr . 153 je Armstrongov broj jer vrijedi (1na treću +5 na treću +3 na treću =1+125+27 =153


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj za koji želite izvršiti provjeru da li je Armstrong broj:");
        int broj = sc.nextInt(); // Broj koji unosimo

        int originalniBroj = broj; // Pohrana originalnog broja za uspoređivanje
        int suma = 0; // Inicijalizacija sume
        int znamenke = String.valueOf(broj).length(); // Računa broj znamenki

        // While petlja za izračun sume znamenki na n-tu poziciju
        while (broj != 0) {
            int ostatak = broj % 10; // Dobijamo zadnju znamenku
            suma += Math.pow(ostatak, znamenke); // Dodaje n-tu znamenku na suma
            broj /= 10; // Micanje zadnje znamenke
        }

        // Provjerava da li je suma jednaka originalnom broju
        if (suma == originalniBroj) {
            System.out.println(originalniBroj + "\t je Armstrong broj");
        } else {
            System.out.println(originalniBroj + " \t nije Armstrong broj.");
        }


        //Zadatak 2:
        //Korištenjem petlje do while izračunaj zbroj brojeva od 1 do 1000 djeljivih sa 7.
//        int a = 1;
//        int suma = 0;
//        do {
//            //Izvršava se makar 1 put prije nego se provjeri uvjet while
//            if (a % 7 == 0) {
//                suma += a;
//            }
//
//            a++; //Povećaj vrijednost varijable a za 1 nakon linije 12
//        } while (a <= 1000);
//        System.out.println("Zbroj brojeva od 1 do 1000 djeljivih sa 7 je: \t" + suma);
//    }
    }
}
