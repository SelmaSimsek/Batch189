package day02variables;

public class Variables02 {
    public static void main(String[] args) {
        //Ornek 9: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.

        String ogrenciAdi = "Ali Can" ;
        System.out.println(ogrenciAdi);

        // null 0 demek degildir. O da coding'
        // te bir degerdir.
        // null hiclik demektir.
        //null ici bos obje demektir.
        /*
        primitive ve non primitive data type arasindaki farklar nelerdir?
        1)Primitivler sadece bizim atadigimiz degeri icerir.
          non Primitivler bizim atadigimiz deger ve method'lar icerirler.
        2)primitivler kücük harfle baslar
          non primitivler büyük harfle baslar
        3)primitivleri Java üretmistir ve 8 tanedir
          non primitivleri Java ve programcilar üretebili, sinirsiz sayidadir.
        4) primitivler memoryde data type larina göre sabit boyutta bellek kullanirlar
          non primitivler icin java memoryde büyüklügüne göre degisen boyutlarda bellek kullanabilirler.


         */

        //Ogrenci notlari icin iki adet variable olusturun ve toplamlarini ekrana yazdirin
        //1.yol
        byte note1 = 50;
        byte note2 = 70;
        System.out.println(note1+note2);




    }
}
