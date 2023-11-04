package day15_StringBuilder;

public class C02_Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy

        sb1.reverse();
        System.out.println(sb1);

        //verilen index teki characteri siler
        sb1.deleteCharAt(0);
        System.out.println(sb1);

        //baslangic indexinden bitis indexine kadar(haric) olan characterleri siler
        sb1.delete(0,3);
        System.out.println(sb1);

        //replace (0,3."X"); 0 dahil, 3 haric olmak üzere indexleri alir ve yerine X koyar.
        sb1.replace(0,3,"x");
        System.out.println(sb1);

        sb1.insert(2, "999");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);//0

        /*
        compareTo(); iki StringBuilder i bastan baslayarak harf harf karsilastirir
        ilk harfler ayni ise ikinci harflere gecer
        ikincilerde ayni ise ücüncülere gecer....
        ve ilk farkli olan harfe gider, farkli olan iki harfin ascii kodlari arasindaki farki verir.

        sonuc 0 ise alfabetik olarak ayni siradalar demektir
        sonuc -1 ise sb2 sb3 den alfabetik olarak önde demektir
        sonuc 1 ise sb2 sb3 den alfabetik olarak sonra demektir
         */

        //String class da var olan ama StringBuilder class da olmayan (split() method gibi) methodlara
        //ihtiyac duydugumuzda toString() methodunu kullanarak String classa gecer ve o methodlari kullanabiliriz

        String str = sb1.toString().toUpperCase();
        System.out.println(str);

        // String nasil StringBuilder a cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);


        /*
        1) StringBuffer java da String üreten bir diger classtir.
        StringBuffer java nin string üretmek icin olusturdugu ilk classtir

        2) StringBuffer, StringBuilder'a cok benzer, yani ikisi de "muatable" string üretir.
        3) StringBuffer "Multi-thread"dir, ama StringBuilder "Multi-thread" degildir. coklu is yapmaya müsait degildir
        4) StringBuilder "Multi-thread" olmadigi icin StringBuffer dan daha hizli calisir.

                3 tane String olusturan class ögrendik;
                1) immutable String lazimsa ==> String class
                2) mutable String lazimsa 2 secenek var: StringBuilder veya StringBuffer
                        a) StringBuilder i multi-thread gerekmezse kullaniriz
                        b) StringBuffer i multi-thread gerekirse kullaniriz

        5) Multi-thread yapilirken yapilan islerin sirasi önem arzeder, yapilan isleri mantikli bir
        siraya koymak  synchronization

         */
        //StringBuffer nasil olusturulur
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);


    }
}
