package day07StringManipulation;

public class C03StringManipulation03 {
    public static void main(String[] args) {
        //Example: Bir String'deki tekrarsiz
        // character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht
        //lastindexOf() parantezi icine yazilan karakterin
        //Stringdeki en son görünümünün indexsini verir.
        //indexOf("m") ==>0 farkli tekrarli
        //lastIndexOf ("m")

        //indexOf ("h") ==> 2 ayni tekrarsiz

        //aranan karakterden bir index veriyorsa tekrari yoktur

        String s = "mehmet";
        if (s.indexOf("m")== s.lastIndexOf("m")){
            System.out.println("m");
        }
        if (s.indexOf("e")== s.lastIndexOf("e")) {
            System.out.println("e");
        }
        if (s.indexOf("h")== s.lastIndexOf("h")) {
            System.out.print("h");
        }
        if (s.indexOf("t")== s.lastIndexOf("t")) {
            System.out.print("t");

        }

        System.out.println();

        //Example 1: Bir banka kartının son 4 hanesi hariç
        // tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(first); //**** **** ****

        String last = cardNum.substring(15);
        System.out.println(last); //6789

        String result = first + last;
        System.out.println(result); //variable rakam ise toplama yapar ve sonuc yanlis olur

        String result1 = first.concat(last);
        System.out.println(result1);//tavsiye edilen




    }
}
