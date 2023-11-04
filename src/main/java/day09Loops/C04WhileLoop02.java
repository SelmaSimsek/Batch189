package day09Loops;

import java.util.Scanner;

public class C04WhileLoop02 {
    public static void main(String[] args) {
        //kullanicinin verdigi sayi icin carpim tablosunu olusturup concole'a yazdiran kodu yaziniz.
        /*    3==>  3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 .....
                    3x10=30
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosu görmek icin bir sayi giriniz");
        int num = input.nextInt();

        int i = 1;
        while (i<11){
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }

         // Belirli bir tamsayinin polindrom olup olmadigini kontrol eden kodu yazin
        //  Polindrome: 121 <==> 121        123321 <==> 123321

        int k = 313;

        // sayiyi rahatlikla indexler ile ters cevirebilmek icin String'e cevirdik
        String m = String.valueOf(k); //"313"

        String reversed = "";
        int n = m.length()-1;
        while (n>=0){
            reversed = reversed + m.charAt(n);
            n--;
        }
        System.out.println(reversed);

        if (m.equals(reversed)){
            System.out.println("Polindrome");
        }else {
            System.out.println("Not Polindrome");
        }

    }
}
