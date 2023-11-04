package day03wrapperconcatenationoperators;

import java.util.Scanner;

public class C05Scanner01 {
    public static void main(String[] args) {

        // NOT:
        // scanner class ı kullanıcı ile etkileşim kurmamızı sağlar
        //Scanner bir Class tır. Java util kütüphanesinden getirildiği için import ister

        Scanner input = new Scanner(System.in);

        //2.adim: Kullaniciya ne istediginize dair nesaj giriniz.
        System.out.println("Lütfen yasinizi giriniz");

        //3.adim: uygun methodu kullanarak kullanicinin verdigi data yi memoriye yerlestiririz
        byte age = input.nextByte();
        System.out.println(age);




    }
}
