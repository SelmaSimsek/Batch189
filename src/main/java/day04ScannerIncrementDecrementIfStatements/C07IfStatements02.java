package day04ScannerIncrementDecrementIfStatements;

import java.util.Scanner;

public class C07IfStatements02 {
    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin
        // tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = input.nextInt();

        //1.yol:
        if (num % 2 == 0) {
            System.out.println("cift sayi....");

        }
        if (num % 2 != 0) {
            System.out.println("Tek Sayi...");
        }
        //2.yol
        //if else statements
        if (num % 2 == 0) {
            System.out.println("Cift sayi");
        } else {
            System.out.println("Tek sayi");
        }
    }
}