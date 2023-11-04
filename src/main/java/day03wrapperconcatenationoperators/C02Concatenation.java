package day03wrapperconcatenationoperators;

public class C02Concatenation {
    public static void main(String[] args) {

        // Ornek : Bir String ve iki integer variable olusturun.
        // String degeri ile Integer larin toplamini console yazdirin

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s+a+b);
        System.out.println(s+a*b);
        System.out.println(s+(a+b));
        System.out.println(a+b+s);
        System.out.println(a+s+b);

        // Java da "+" sembolü iki sayi arasinda kullanilirsa "toplama islemi" olur
        //Java da "+" sembolu iki String veya bir String ve bir sayi arasinda kullanilirsa "concatenation" islemi olur
        //"concatenation" islemi birlestirme yapar
        //Note: Contanetion islemlerinde java matematikse islem onceligine dikkat eder

        /*Matematikte islem onceligi
        1)Once uslu sayilar
        2)Parantez ici islemler yapilir
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve Cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir
         */





    }
}
