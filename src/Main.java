import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Klasa scanner za unos podataka od korisnika
        System.out.println("Upišite varijablu a:");
        //  int a=sc.nextInt();//Slijedeći integer koji se pojavi u konzoli zapiši u varijablu a
        int a = Integer.parseInt(sc.nextLine()); //NextLine je tipa String i konvertiramo ga u int
        System.out.println("Upišite varijablu b:");
        int b = Integer.parseInt(sc.nextLine());//NextLine je tipa String (ide u novu liniju) i konvertiramo ga u int (broj)
//        int b=sc.nextInt();//Slijedeći integer koji se pojavi u konzoli zapiši u varijablu b
        int c;
        //Ternarni operator
//        int a=2 ;
//        int b=5;
//        int c;
//        if(a>b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
        //Ako je a>b ispisat će se a ,a ako nije istinit onda b
        //Ternarni operator -lijevo od upitnika je izraz koji provjeravamo
        //Ako je izraz istinit izvršava se lijevo od dvotočke ,a ako nije istinit desno od dvotočke
        c = (a > b) ? a : b;
        System.out.println("Najveći uneseni broj je:" + c);
    }
}