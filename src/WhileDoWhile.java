public class WhileDoWhile {
    public static void main(String[] args) {
        int a=8;
        //WHILE se može dogoditi da se nikad ne izvrši dok kod DO WHILE se mora barem jednom izvršiti
//        while (a>15){
//            System.out.println(a);
//            a++;//Povećaj vrijednost varijable a za 1
//            //a-- Smanji vrijednost varijable za 1
//        }
        do {
            //Izvršava se makar 1 put prije nego se provjeri uvjet while
            System.out.println(a);
            a--; //Povećaj vrijednost varijable a za 1 nakon linije 12
        }while (a>15);
    }
}
