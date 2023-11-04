package day20_Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {


        //ArrayList ler eleman silme ve eklemede tekrar indexleme yapmak zorunda
        // olduklarindan cok basarisizlardir
        //LinkedListler index kullanmazlar bu yüzden node ekleme ve silme islemlerinde
        // tekrar indexleme yapilmaz, LinkedListlerde node ekleme ve silme islemlerinde sadece
        //pointer lari degistirir
    /*1) ArrayListler eleman silma ve eleman eklemede basarisizdirlar
    O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa ArrayList kullanmak tavsiye edilmez
    2) LinkedListler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
    Bu da LinkedListleri eleman ekleme ve silmede cok basarili hale getirir
    3)ArrayListlerde search islemi kolay yapilir, cünkü indexler adres gibidir
    4)LinkedListlerde search islemi zor yapilir cunku LinkedListler index kullanmazlar
    index kullanmayincaherhangi bir elemani bulmak icin en bastan tüm elemanlar kontrol edilir bu da cok fazla is demektir
      */

        LinkedList<String> list = new LinkedList<>();
        list.add("Mehmet");
        list.add("Ahmet");
        list.add("Onur");
        list.add("Kübra");
        list.add("Tuba");
        list.add("Duygu");
        System.out.println(list);//[Mehmet, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.add(1,"Zafer");
        System.out.println(list);//[Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.addFirst("Onur");
        System.out.println(list);

        list.addLast("ibrahim");
        System.out.println(list);//[Onur, Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu, ibrahim]

        list.remove("Mehmet");
        list.remove(1);

        //  list.removeFirstOccurrence("Mehmet");
        //   list.removeLastOccurrence("Mehmet");

    /*
    Retrieves, but does not remove, the head (first element) of this list.
    Returns:the head of this list, or null if this list is empty
     */

        System.out.println(list.peek());//ilk node u silmeden size verir (copy+paste)
        System.out.println(list);

    /*
    Retrieves and removes the head (first element) of this list.
    Returns:   the head of this list, or null if this list is empty
     */

        System.out.println(list.poll ());//ilk node u size verir ama listten siler (cut+paste)
        System.out.println(list);


        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty
         */
        /*
        Note: peek() ile element() ikiside ilk elemani silmeden size verir.
        peek() list bos oldugunda size null verir element() ise hata verir.
         */
        System.out.println(list.element());
        System.out.println(list);

        /*
        Note: poll() ile pop() ikiside ilk elemani siler ve size verir
        ama poll() list bos oldugunda size null verir, pop() ise hata verir
         */
        System.out.println(list.pop());
        System.out.println(list);





    }

}
