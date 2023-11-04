package day22_map_Exception;

public class E01 {

        /*
        Exception, beklenmedik problem demektir. java cözemedigi bir sorunla karsilastiginda exception class i devreye girer
        Exception class i  biz karsilasilan sorunun cinsini ve bu sorunun nereden kaynaklandigini ve sebebini verir
        Java exception firlattiginda kodun calismasini durdurur ve bizden bir karar vermemizi ister
        ==> Eger gereksinimlere göre kodumuzun calismaya devam etmesini istiyorsak, try catch ile wxception olusturmasi muhtemel kodlarimizi
        try catch blogu icine yazmaliyiz
        ==> Exception i halledebilmek icin iki temel yol var
            a) Exception a uygun cözümler üretebilirsini. buna Exception Handling denir
                bunun icin try catch kullanilir, try block icinde yapilmasi istenen islemi javadan yapmasi istenir
                Java islemi problemsiz bir sekilde yaparsa catch block java tarafindan okunmaz
                try block da islem yapilirken Exception olusursa catch block devreye girer ve catch block icindeki kodlar calisir
                try block da islem yapilirken Exception olusursa try block icindeki hata sonrasi kodlar calistirilmaz.
            b) Exception olustugunda bunu ilan eder ve geri cekilirsiniz, buna da throw exception denir
            ==> catch parantezi icindeki karsilasmamiz muhtemel olan exception classisimini ve bir obje ismini (e),
        catch block una ise exception ile karsilasilidiginda yapilmasini istedigimiz kodlari yazariz
        ==> Yazdigimiz kod calismadiginda problemi bulmak icin log lara bakariz.



         */

    public static void main(String[] args) {
        divide(12, 0);

        divide2(5, 0);

    }

    //AritmeticException yazdiginiz code da matematiksel islem kullaniyorsaniz alabileceginiz bir exception cesididir.
    public static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zerod");
        }
        System.out.println("try-catch sonrasi kod akisina devam ediyor");




        /*if(b==0){
            System.out.println("Do not divide by zero");
        }else */


    }

    public static void divide2(int a, int b) {

        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zerod");
        }
    }
}