package day07StringManipulation;

public class C02StringManipulation02 {
    public static void main(String[] args) {
        //Example 1: Asagida fiyatlari verilen urunlerin
        // toplam fiyatini bulunuz.
        // String tv = "$456.99";
        // String laptop = "$875.99"; ==>
        // 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String newtv = tv.replace("$","");
        String newlaptop = laptop.replace("$","");

       Double totalPrice = Double.valueOf(newtv) + Double.valueOf(newlaptop);
        System.out.println(totalPrice); //1332.98


        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC

        String name = "   ali CAN   ";
        //trim methodu bir Stringin bas ve sonundaki
        // space leri siler. ortadakilere karismaz
        char first = name.trim().toUpperCase().charAt(0);
        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.print(first);
        System.out.print(last);

        String neww = name.split("A")[1];
        System.out.println("neww = " + neww);

        //Ornek : Bir string'in belirli bir karakterinden
        // baslayarak belirli bir karaktere kadar tum
        //karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail

        //indexOf() methodu parantezi icerisine yazilan karakterin indexini verir.

        //1.yol. hard coding tavsiye edilmez
        String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9));

        //2.yol
        int startingIndex = a.indexOf("@")+1; //@ i almamak icin 1 ekledik
        int endingIndex= a.indexOf("."); // noktanin indexini verdi
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println(companyName);





    }
}
