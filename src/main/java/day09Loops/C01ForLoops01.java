package day09Loops;

public class C01ForLoops01 {
    public static void main(String[] args) {
        /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */
        for (int i = 1; i < 5; i++) {
            System.out.println("Week : " + i);
            for (int j = 1; j < 8; j++) {
                System.out.println("Day : " + j);
            }

        }

                /*
    Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
        for (int k = 1; k <=3; k++) { //distaki loop satirlar icin satir sayisi kadar calisir

            for (int l = 1; l <=5; l++) {
                System.out.print("x"); // icteki loop yanyana yazdigindan sütunlar icin sütun sayisi kadar cakisir

            }
                System.out.println(); //satir yan yana print ile yazdirildigindan
                // pointer i bir sonraki satira almak icin kullandik

            }

        }
    }

