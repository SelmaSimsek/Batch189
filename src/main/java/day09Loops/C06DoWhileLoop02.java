package day09Loops;

import java.util.Scanner;

public class C06DoWhileLoop02 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi aliniz
        Tamsayi 100 den kücük ise kullaniciya "kaybettiniz" mesaji vererek oyunu sonlandiriniz
        Tam sayi 100 ve 100 den büyükse "Kazandiniz" mesaji vererek oyuna devam ettiriniz.

         */

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lütfen bir tamsayi giriniz");
            int num = input.nextInt();

            if (num >= 100) {
                System.out.println("Kazandiniz!!");
            } else {
                System.out.println("Kaybettiniz!!");
                break;
            }
        }while (true);




    }
}
