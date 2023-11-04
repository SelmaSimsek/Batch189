package day06SwichTernaryString;

import java.util.Scanner;

public class C01Switch {
    public static void main(String[] args) {

        //Ay numarasini söyleyince, numarasi verilen ay'dan baslayip 12. aya kadar tüm aylarin isimlerini
        // yazdiran kodu yaziniz
        // 8==> August - September - October - November - December


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("Aprel");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("Augusut");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("Oktober");
            case 11:
                System.out.println("Novenber");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Lütfen gecerli ay numarasi veriniz");

            /*
             Not: switch condition parantezi icine
             1) String 2)int 3)byte 4)short 5)char kullanabiliriz
             sweitch condition parantezi icine 1) long 2) boolean 3)float 4)double kullanilmaz

             */



        }
    }
}
