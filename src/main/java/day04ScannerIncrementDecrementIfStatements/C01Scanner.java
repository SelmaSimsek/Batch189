package day04ScannerIncrementDecrementIfStatements;

import java.util.Scanner;

public class C01Scanner {
    public static void main(String[] args) {


    /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu
        v) medeni durumunu girmesini isteyin
         Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adinizi ve Soyadinizi giriniz");
        //nextLine() methodu kullanicidan cok kelimeli string almak icin kullanilir.
        String fullName = input.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Lütfen Boyunuzu Giriniz");
        float height = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz");
        short weight = input.nextShort();

        System.out.println("Lütfen medeni durumunuzu giriniz");
        // next() methodu kullanicidan tek kelimeli string almak icin kullanilir
        String materialStatus = input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("materialStatus = " + materialStatus);








    }
}
