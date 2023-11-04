package day21_maps;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {
     /*
     1) MAp laerde sözlüklerdeki gibi kelime ve manasi saklinde bir kullanim vardir
     2) Key kismi tekrarsiz, value kismi tekrarli olabilir
     3) Map lerde her bir elemana entry denir, tamamina EntrySet denir
     4) Entry ler tekrarsiz oldugu icin EntrySet denilir.
     5) Map ler collection degildir
     6)HashMap ler entry leri rastgele siralar, bu yüzden en hizli Map dir
      */

        //Map nasil olusturulur
        HashMap<String,Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Türkiye", 83000000);
        countryPopulation.put("Netherland", 30000000);
        System.out.println(countryPopulation);//{Netherland=30000000, USA=400000000, Türkiye=83000000, Germany=83000000, Albania=30000000}

        // get() methodu key ile calisir ve bize Value kismini verir
        Integer usaPopulation = countryPopulation.get("USA");
        System.out.println(usaPopulation);

        //bütün key leri nasil alabiliriz
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //bütün value lari nasil alabiliriz
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?

        int sum = 0;

        for (Integer w :values) {
            sum = sum+w;
        }
        System.out.println(sum / values.size());


        // Looplar Mapler ile kullanilamaz, bunun icin entrySet methodunu kullaniriz.
        // entrySet() methodu mapteki enty leri kalip halinde bize Set in icene koyarak verir
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int toplam = 0;

        for (Map.Entry<String,Integer> w :entries) {
            toplam= toplam+w.getKey().length() + w.getValue();


        }
        System.out.println(toplam);


        int toplamnüfus = 0;
        int toplamKarakter= 0;


        for (Map.Entry<String,Integer> w :entries) {
            toplamKarakter= toplamKarakter+w.getKey().length();
            toplamnüfus = w.getValue();


        }
        System.out.println("" + toplamKarakter+"\n"+toplamnüfus);









    }
}
