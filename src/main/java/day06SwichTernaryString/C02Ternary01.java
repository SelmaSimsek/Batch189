package day06SwichTernaryString;

public class C02Ternary01 {
    public static void main(String[] args) {
        int y = 11;
        int z = 11;
        int result = y<10? y++ : z++;
        System.out.println(result + ","+ y + ","+z);

        //Bir sayinin mutlak degerini hesaplayan kodu yaziniz
         // -4 ==> -1*-4       4==>4 0==>0

        int c = 4;
       // condition ? true : false ;
        int result1 = c<0 ? -1*c : c ;
        System.out.println(result1);

        /*
        Iki sayinin isareti ayni ise bu sayilari carpan
        isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        mesaji veren kodu yazdir
         */

        int a = 3;
        int b = 13;

        Object result2 =(a>0 && b>0) || (a<0 && b<0) ? a*b : "Farkli isaretli sayilari carpamiyorum";
        /*
        "Object Javada bütün non-primitive data type larinin (Class) ortak parent idir.
        "Object" class in parenti yoktur.
        Farkli data type lar ile bir variable olusturmak istiyorsak "Object" clasi kullaniriz.
        "Object" kodlarda uyusmazlik oldugunda kullaniriz

         */

        System.out.println(result2);
    }
}
