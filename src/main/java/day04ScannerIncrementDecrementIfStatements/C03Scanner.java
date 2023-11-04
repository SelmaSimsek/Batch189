package day04ScannerIncrementDecrementIfStatements;

import java.util.Scanner;

public class C03Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen  dikdörtgenin kisa kenar uzunlugunu giriniz");
        float shortSide = input.nextFloat();
        System.out.println("lütfen  dikdörtgenin uzun kenar uzunlugunu giriniz");
        float longSide = input.nextLong();

        System.out.println("alan: "+shortSide*longSide);
        System.out.println("cevre . "+(2*shortSide + 2*longSide));

    }
}
