package day05IfStatementsSwitchTernary;

import java.util.Scanner;

public class C01IfStatements {
    public static void main(String[] args) {
        //Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz...");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Pozitif");
        } else if (num < 0) {
            System.out.println("Negatif...");
        } else {
            System.out.println("Notr");
        }
    }
}