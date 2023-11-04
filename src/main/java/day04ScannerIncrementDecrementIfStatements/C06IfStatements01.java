package day04ScannerIncrementDecrementIfStatements;

import java.beans.JavaBean;

public class C06IfStatements01 {
    public static void main(String[] args) {
        // if Statements
        // Bazi kodlarin bazi sartlara göre aktive edebilmek icin if statements kullanilir.

        // if you study hard, you will learn Java. ==> Englisch
        /*
         if(you study hard) {
            you will learn Java ==> Java
         }
         */

        // örnek 1: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirsin.

        int number = 3;

        if(number>-1 && number<10){
            System.out.println("Rakam");
        }

        int number1 = 13;

        if(number1>-1 && number1<10){
            System.out.println("Rakam");
        }

        //örnek 2: sayi üc basamakli ise ekrana "Sayi üc basamaklidir" yazdirin.

        int n = 123;
        if(n>99 && n<1000){

            System.out.println("sayi üc basamaklidir");

        }






    }
}
