package day12arrayList;

import java.util.Random;

public class MethodCreation01 {  //method olusturma
    public static void main(String[] args) {
        /*
        Java da method nasil olusturulur?
        ==> Main Methodun disinda, classin icide olusturulur
        1) Access Modifier + return Type + Method ismi + () + {}
        2) Method olusturmak methodu calistirmak icin yeterli degildir

         */

        //Method call : "main method icinde bir method kullanilmasina call denir"
        int sonuc = toplamaYap (3,5);
    } //main sonu


    //örnek 1: toplama islemi yapan bir method olusturunuz

    public static int toplamaYap (int a, int b){
        return a+b;


    }



} //class sonu
