package day05IfStatementsSwitchTernary;

import java.util.Scanner;

public class C05IfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan 0 dan kücük 120 den büyük deger girilmeyecek sekilde datalari aldiktan sonra
         eger calisan kadin ise;
         60 yasindan büyükse "Emekli olabilir" yazdirin

         eger calisan erkek ise;
         65 yasindan büyükse "Emekli olabilir" yazdiran kodu olusturunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz");
        String gender = input.next();

        System.out.println("Yasinizi Giriniz");
        int age = input.nextInt();

        if (age < 0 && age > 120) {
            System.out.println("Lütfen yasi 0 ile 120 arsinda giriniz");


        }else if (gender.equalsIgnoreCase("Kadin")) {

            if (age > 60) {
                    System.out.println("Emekli Olabilir");
            }else {
                System.out.println("Calismali");
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {

             if (age > 65) {
                    System.out.println("Emekli Olabilir");
             } else {
                 System.out.println("Kesinlikle Calismali");
             }

        } else{
                System.out.println("tanimli dedil");

        }


    }
}
