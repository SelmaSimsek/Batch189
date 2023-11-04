package day21_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you, like like!";
        //Stringimizde bulunan tüm noktalama isaretlerinden kurtulmamiz lazim
        s= s.replaceAll("\\p{Punct}","");
        System.out.println(s);//I like you like like

        // kelimelerle calisacagimiz icin split(" ") kullanmaliyiz
        String words []= s.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        //words Arrayindaki kelimeler birer birer Map te var mi diye kontrol edilecek
        //words Arrayindeki kelimeler Map de yok ise Map e value su 1 olarak yerlestirilecek
        //words Arayyindaki kelimeler Map de var ise Map a value su 1 arttirilarak yerlestirilecek

        HashMap<String,Integer> occ = new HashMap<>();
        for (String w : words) {
            Integer numOffCurrance = occ.get(w);

            if (numOffCurrance==null){
                occ.put(w,1);
            }else {
                occ.replace(w,numOffCurrance+1);
            }
        }
        System.out.println(occ);//{like=3, I=1, you=1}





        /*
        HashMap ile HashTable arasindaki fark nedir
        1) HashMap thread-safe ve synchronized degildir, HashTable thread-safe ve synchronized dir
        2) HashMAp bir tane null key e ve istediginiz kadar null value a müsaade eder
            HashTable keylerde ve value larda null kullanilmasina müsaade etmez
        3) HashMap hizlidir, HashTable HashMap e göre yavastir.

        Note: HashMAp ler ve HAshTable lar entry leri rastgele siralar

         */

        Hashtable<String,Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Selma",70);
        ogrenciNotlari.put("Tuba",70);
        ogrenciNotlari.put("Ibrahim",70);
        ogrenciNotlari.put("Safa",70);
       // ogrenciNotlari.put(null,50); Hashtable larda key kisminda null konulmaz
        //ogrenciNotlari.put("Ahmet",null);Hashtable larda value kisminda null konulmaz

       /* HashTable ne zaman kullanmaliyiz
        1) multithread ve synchronization kullanmamiz gerekirse
        2) key lerde ve value lerde null kullanmak yasak ise kullanabiliriz

        */

        Hashtable<String,Integer> stdAges = new Hashtable<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("null",41);
        stdAges.put("nullt",39);
       // stdAges.put("a",null);
       // stdAges.put("b",null);
       // stdAges.put("c",null);
        System.out.println(stdAges);


        /*
        1)TreeMap ler entry leri naturalorder a göre siraya koyar, bu yüzden coook yavastir.
        2)TreeMap ler thread-safe ve synchroniyed degildir
        3)TreeMaplerin key lerinde null kullailmaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) TreeMap ler key e bakarak siralama yapar
         */

        TreeMap<String,Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Türkiye", 83000000);
        countryPopulation.put("Netherland", 30000000);
        //countryPopulation.put(null, 30000000); hata verir
        countryPopulation.put("Italy", null);
        countryPopulation.put("Fransa", null);

        System.out.println(countryPopulation);








    }
}
