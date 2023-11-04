package day15_StringBuilder;

public class C01_Sb01 {
    public static void main(String[] args) {

        /*
        1) "String Builder" classi da String üreten bir classtir
        2)String class kullanarak String üretiriz, java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez string üretir, StringBuilder Class "mutable" (degistirilebilir string üretir
        3)"immutable" olmak demek orijinal degerin korunmasi, degistirilemez olmasi demektir
        "mutable" olmak demek orijinal degerin degistirilebilir olmasi denektir
         */

        //Immutable
        String s = "java";
        String t = s+"!";
        String w = t+"?";


        /*
        Stringi degistirdikten sonra, ayni stringe assign ederseniz java yine yeni bir container olusturur
        degismis degeri bu yeni containerin icine koyar ve eski containeri gösteren pointer yeni conteiner a yonlendirilir
        dolayisiyla eski container adressiz kalir ve "Garbage Collector" adressiz olan containerlari siler
         */



        //Mutable
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");
        System.out.println(sb1); //Python

        //StringBuilder olusturmanin ikinci yolu:
        StringBuilder sb2 = new StringBuilder();


        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        sb2.append("***************");
  
        System.out.println(sb2); //4
        System.out.println(sb2.capacity());//16

        //capacity ve lenght arasindaki fark nedir?
        /*
        capacity javanin size verdigi data depolama yer sayisidir,length ise size verilen data depolama yerinin kullanilan kismidir
        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity i asarsaniz java yeni capacityi varolanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16=> 16*2+2  ==> 34   ===> 34*2+2  .....
         */

        //StringBuilder olusturmanin 3. yolu
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");








    }
}
