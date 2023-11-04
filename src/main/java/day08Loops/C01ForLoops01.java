package day08Loops;

public class C01ForLoops01 {
    public static void main(String[] args) {
        //Ekrana 5 kere "Hi" yazdirin
        //1.yol
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2.yol
        /*for (Baslangic degeri ; loopun calisma sarti ; arttirma/azaltma) {
            tekrarli bir sekilde yazmak istedigimiz kodlar

        }
         */
        //Baslangic degeri ; loopun calisma sarti ; arttirma/azaltma
        for (int i=1    ;     i<6       ;      i++){
            System.out.println("Hi...");
        }

        //Example 2: 11'den 14'e kadar tum tamsayilari
        // ekrana yazdiran kodu yaziniz

        for (int i=40; i>22; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }







    }
}
