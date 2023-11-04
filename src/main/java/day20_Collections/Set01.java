package day20_Collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        /*
        1)Setler tekrarsiz eleman (unique) depolamak icin kullanilir
        2) 3 tane Set Class i vardir
            a)HashSet Class
                Hash benzersiz id olusturma teknigidir. bu teknige Hashing technique denir
                HashSet elemanlari rastgele siralar
                HashSet elemanlari siralamadigindan cok hizli calisir
                HashSetler null i eleman kabul eder
            b)LinkedHashSet Class
                LinkedHashSet ler elemanlari sizin verdiginiz siraya göre dizdiklerinden(insertion order)
                Hashlere göre yavastirlar
            c)TreeSet Class
                TreeSet elemanlari natural order a göre dizerler
                ve bu nedenle cok yavas settir
                null i eleman olarak kabul etmezler
        3) TreeSet cok yavas oldugundan mümkün oldugu kadar TreeSet kullanmamaya calisiriz
         */

        HashSet<String>hs = new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs); //[Kerem, Sinan, Tuba, Onur]
        hs.add("Tuba");//tekrarli elemanlari eklerken hata vermez ama sadece bir kere ekler
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur]
        hs.add(null);//[Kerem, null, Sinan, Tuba, Onur]
        System.out.println(hs);
        hs.add(null); //hata vermez bir defa yázar
        System.out.println(hs); //[Kerem, null, Sinan, Tuba, Onur]


        LinkedList<Integer> lhs = new LinkedList<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs); //[313, 19, 7, 1, null]

        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(313);
        ls.add(19);
        ls.add(7);
        ls.add(11);
        System.out.println(ls);//[313, 19, 7, 11]

        lhs.retainAll(ls); //iki set arasinda ortak olanlari alir, olmayanlari siler
        System.out.println(lhs);//[313, 19, 7]
        System.out.println(ls);//[313, 19, 7, 11]


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add(null);
        System.out.println(ts);//Exception in thread "main" java.lang








    }
}
