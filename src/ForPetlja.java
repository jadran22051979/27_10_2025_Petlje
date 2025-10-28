public class ForPetlja {
    public static void main(String[] args) {
        int y = 1;
        for (int i = 1; i <= 10; i += 2) { //i =i +2
            System.out.println("Broj" + y + "Ispisan:" + i + "puta");

//            for (int j = 0; j < 100; j += 2) { //j =j +2 ->Drugi primjer od 0 do manji od 100
//                System.out.println("Broj" + y + "Ispisan:" + i + "puta");
//
//            }

            int[] godine = {10, 25, 42, 60, 18};
            for (int j : godine) { //Napredna petlja for
                System.out.println(j);
            }
        }
    }
}
