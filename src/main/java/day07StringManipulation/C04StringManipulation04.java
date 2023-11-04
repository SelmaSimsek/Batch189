package day07StringManipulation;

public class C04StringManipulation04 {
    public static void main(String[] args) {
        /*  Örnek : Bir parolanın aşağıdaki koşullara
        sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır,
       en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı,
       space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
       */

        String pwd = "    ";
        //i) Parola Boş olmamalıdır,
        // en az bir karakter icermelidir.
        // isEmpty() eger bir string tamamen bos ise
        // yani karakter icermiyor ise true verir.

        boolean first = pwd.isEmpty();
        System.out.println("first = " + first);

        //ii) Karakterler Sadece (space)
        // boşluk karakterlerden ibaret olmamalı,
        // space harici karakterlerde bulunmalidir
        //isBlank() methodu sadece space iceren Stringler icin true verir
        //space disinda bir karakter icerirse false verir

        boolean second = pwd.isBlank();
        System.out.println("second = " + second);

        /*
        isBlank() methodu bos Stringler icin de true verir.
        isBlank ==> space + hicbirsey icin de true verir
        isEmpty ==> sadece hicbirsey icin true verir
         */
        //iii) Başında ve sonunda boşluk olmamalıdır.

        boolean third = pwd.trim().equals(pwd);
        System.out.println("third = " + third);

        if (first){
            System.out.println("parola bos birakilamaz");
        }
        if (second){
            System.out.println("parolada bosluk haricinda gorunur karakterler de bulunmalidir");
        }
        if (!third){
            System.out.println("Parola basinda ya da sonunda bosluk birakilmamalidir");
        }

        //memory kullanimi
        /*
        Stringlerin esitliklerini kontrol ederken == yerine
        equals kullaniriz. cünkü == sembolu kullanilirsa, iki stringi karsilastirirken
        hem adresleri(referans) hem de degerleri kontrol edilir.
        eger her ikisi de esit ise esittir der.
        equals() methodu ise iki stringi karsilastirirken sadece degerlerine bakar,
        degerleri ayni ise bu iki string esittir der.
        farkli ise ikistring farklidir der.



         */


    }
}
