package day06SwichTernaryString;

public class C03Ternary02 {
    public static void main(String[] args) {
        //Size verilen sayinin 3 basamakli olup olmadigini kontol eden kodu yaziniz.

        int a = 313;
        a=Math.abs(a); // atama yapilan deger - de olsa onun mutlak degerini alir



        String result = a>99 & a<1000 ? "üc Basamaklidir" : "Üc Basamakli degildir";
        System.out.println(result);


        //Verilen yilin Artik Yil (Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        //1) yil 100 e bölünürse 400 e de bölünmelidir. 1600==>Leap 1800==> Leap degil
        //2) yil 100 e bölünmüyorsa 4 e bölünmelidir. 2004==>Leap 2005==>Leap degil

        int year = 1600;

        String leapYear = year%100==0
                ?
                (year%400==0?"Leap":"leap Degil")
                :
                (year%4==0?"Leap":"Leap Degil");
        System.out.println(leapYear);


        // && ile dene

    }
}