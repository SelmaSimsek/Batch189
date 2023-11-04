package day05IfStatementsSwitchTernary;

import java.util.Scanner;

public class C03IfStatements {
    public static void main(String[] args) {
        /*
        Kullnicidan yas degerini alan ve yasina göre hangi evrede oldugunu asagidaki tabloya göre yazdiran kodu olusturunuz
         0-4 bebek
         5-12 cocuk
         13-20 genc
         21-30 yetiskin
         30 üstü tanimlanmamis
         hata mesaji olarak "Gecerli bir yas giriniz" yazdiriniz

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int age = input.nextInt();

        if (age<0){
            System.out.println("Gecerli bir yas giriniz");
        }else if (age<5){
            System.out.println("Bebek");
        }else if (age<13){
            System.out.println("Cocuk");
        } else if (age<21) {
            System.out.println("Genc");
        } else if (age<31) {
            System.out.println("Yetiskin");
        }else {
            System.out.println("Tanimlanmamis yas");
        }
    }

}
