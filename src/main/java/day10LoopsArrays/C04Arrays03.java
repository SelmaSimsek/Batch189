package day10LoopsArrays;

import java.util.Arrays;

public class C04Arrays03 {
    public static void main(String[] args) {
        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3


        //Arraylari kisa yoldan nasil olusturabiliriz?
        int numbers [] = {12, 3, -3, 5, 23};

        for (int w :numbers) {
            if (w<5){
                System.out.println(w+ " ");
            }


        }

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String names [] = {"K","C","R","A","S"};

        //binarySearch() methodu
        //binarySearch() methodu aramaya ortadan baslar. olmayan tarafi dirak siler. bu nedenle cok hizlidir.
        //binarySearch() methodunu, sort()kullanmadan kullanmayiz
        //binarySearch() methodu var olan elemanlar icin, o elemanin indexini verir.
        //binarySearch() methodu olmayan elemanlar icin negatif tamsayi verir.
        //"-" ==> isaretinin anlami eleman yok demektir.
        // - nin yanindaki sayi ==> olsaydi kacinci eleman olurdu. VARSA INDEX; YOKSA SIRASINI VERIR

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, "U");
        System.out.println(result); // -6

        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s);

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy., Learn, Java, earn, money.]
        System.out.println(words.length); //7











    }
}
