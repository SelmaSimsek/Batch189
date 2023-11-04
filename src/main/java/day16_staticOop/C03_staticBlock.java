package day16_staticOop;

import java.time.LocalDate;

public class C03_staticBlock {

    // bir variable olusturdugunuzda deger atamazsaniz o variableyi initialize etmediniz demektir.
    static double pi;

    //bazen main method calistirilmadan önce variabla larin hazir hale getirilmesi gerekir. bu yüzden static bloklar kullanilir
    //static variable lar static bloklar icinde initialize edilirse o clasin icinde herseyden önce
    //hazir hale getirilmis olur

    public  static int price ;


    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("Main Method");

    }
    //birden fazla static block  var ise yukaridan asagiya calisir
    static {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getMonthValue()==2){
            price=1000;
        }else {
            price= 2000;
        }
    }



    static {
        pi=3.14;
        System.out.println("Static Block 1");
    }




}
