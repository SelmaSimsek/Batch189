package day24_enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {
    public static void main(String[] args) {
        /*
        yineleme
        1) Iterator lar loop larin yaptigi ayni isi yapar
        2) Iterator larda sonsuz loop olusma ihtimali yoktur
        3) Itertor ile looplar arasinda performans farki yoktur
        4) Iterator lar bir collectiondan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir
        5) iki tip iterator vardir:
            a) Iterator.
            Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mümkün degildir

            b)ListIterator:
            Bu eleman silebilir, ekleyebilir ve degistirebilir
            Iterator sadece solda saga (ilk elemandan son elemana) calisir
            ListIterator iki yönlü calisabilir

            iteratordan eleman silince es zamanli listeden de silinir


         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList); //[Tom, Jim, Clara, Fatma, Mustafa]

        //spesific bir elemani iterator ile nasil silebiliriz
        Iterator<String> myItr = myList.iterator();
        while (myItr.hasNext()){   // hasNext iterator un baslangicinda duran pointer a kendisinden sonra eleman olup olmadigini sorar
            // eleman varsa true yoksa false return eder.

            //????

            myItr.next();// next() pointer i bir adim atlatir. yani bir sonraki elemanin onüne tasir ve  üzerinden atladigi elemani return eder
            myItr.remove(); // remove() methodu next() methodunun return ettigi yani pointerin en son üzerinden atladigi elemani siler

        }
        System.out.println(myList);




        //ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");
        System.out.println(yourList);


        ListIterator<String> yourListItr  =yourList.listIterator();//[Ali, Can, Aliye]

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el+"*");

        }
        System.out.println(yourList);//[Ali*, Can*, Aliye*]

        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);

        ListIterator<String> listItr2 = list3.listIterator();//[Ali, Can, Aliye]

        //Bu loop pointer i en saga almak icin yazildi
        while (listItr2.hasNext()){
            listItr2.next();
        }
        //elemanlari sondan basa dogru yazdirin
        while (listItr2.hasPrevious()){

            String el = listItr2.previous();
            System.out.println(el + "<--  ");//Aliye<--
                                            //Can<--
                                            //Ali<--
        }










    }
}
