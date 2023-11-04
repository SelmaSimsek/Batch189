package day05IfStatementsSwitchTernary;

import java.util.Scanner;

public class C02IfStatements {
    public static void main(String[] args) {
    // Gün sayisini verdigimizde gün ismini yazan kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kacinci gün oldugunu girin");
        byte num = input.nextByte();

        if (num==1){
            System.out.println("Sunday");
        } else if (num==2) {
            System.out.println("Monday");
        }else if (num==3) {
            System.out.println("Tuesday");
        }else if (num==4) {
            System.out.println("Monday");
        }else if (num==5) {
            System.out.println("Wednesday");
        }else if (num==6) {
            System.out.println("Thursday");
        }else if (num==7) {
            System.out.println("Saturday");
        }else{
            System.out.println("Hatali giris yaptiniz. Lütfen 1 ile 7 arasinda bir sayi giriniz");

        }

    }
}
