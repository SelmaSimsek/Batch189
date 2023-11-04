package day02variables;



public class Variables01 {
    public static void main(String[] args) {
        // variable nasil olusturulur?
        // Data Type + Variable Name + Assigment Operator(atama Operatoru) + Variable degeri + noktali virgül;
        int age = 19;
        System.out.println(age);
        // System.out.println(); yazdirmanin kisa yolu ==> sout yaz enter a bas

        /*
        Javada temelde iki tip data vardir;
        1)Primitiv data type;
            char, boolean, byte, short, int, long, float, double

        2)non-primitive data type;
            String
         */
        //char data type: 2 byte
        // Tek karakterler icin kullanilir. Örnegin==> A, a, ?, 5
        // örnek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        // Data Type + Variable Name + Assignment Operator(Atama Operatoru) + Variable Degeri + noktali virgül;
        char isminIlkHarfi ='A';
        System.out.println(isminIlkHarfi);

        //boolean data type
        // boolean lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
        //Örnek 2: boolean data Type'inda emekli misin sorusu icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false;
        System.out.println(emeklimisin);


        //byte data type:
        //tam sayilar icidir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir
        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte ogrenciYasi = 13;
        System.out.println(ogrenciYasi);


        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir
        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 3241;
        System.out.println(siteNufusu);

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir
        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz
        int ulkeNufusu = 85566000;
        System.out.println(ulkeNufusu);

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.
        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.

        long vucutHucreSayisi = 89498954545454L;
        // Not: Eger long'a atadigimiz deger int'lerin  araliginda ise sonuna L koymaya gerek yoktur.
        // ama int'lerin araligi disinda ise bunun long oldugunu sonuna L koyarak javaya söylemeliyiz.

        long weightOfSun = 123455555555L;
        System.out.println(weightOfSun);

        //float data type:
        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)
        //float memory'de 4 byte yer kaplar.
        //Not: float olusturuldugunda sonuna F ya da f koymaliyiz, cünkü java ondalikli sayilari otomatik olarak double kabul eder.
        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun
        float gomlekFiyati = 19.99f;
        System.out.println(gomlekFiyati);

        // double data type:
        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir
        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)
        //Ornek 8: Hucre agirligi icin bir tane variable olusturun
        double hücreAgirligi = 0.00000000005;
        System.out.println(hücreAgirligi);
        //5.0E-11
        //Not: "E" exponent (üs demek) 5.0 carpi 10 üzeri -11;











    }


}
