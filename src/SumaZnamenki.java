import java.util.Scanner;

public class SumaZnamenki {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj čiju sumu znamenki želiš izračunati:");
        int broj = sc.nextInt();
        int privremeniBroj =Math.abs(broj);
        int sumaZnamenki=0;

        while (privremeniBroj >0){
            //356 :10 =35 -> cjelobrojno dijeljenje
            //ostatak je 6 -> modulo odnosno ostatak pri dijeljenju
            //Normalno dijeljenje = 35.6
            //35 :10 =3 -> cjelobrojno dijeljenje
            //Ostatak 5 -> ostatak dijeljenja
            //3:10 =0
            //Ostatak je 3
            int zadnjaZnamanka = privremeniBroj % 10; //Modulo tj ostatak
            sumaZnamenki += zadnjaZnamanka;
            privremeniBroj =privremeniBroj /10; //cjelobrojno dijeljenje

        }
        System.out.println("Zbroj znamenki broja\t" + broj+ "\tjednak je\t" +sumaZnamenki);

    }
}
