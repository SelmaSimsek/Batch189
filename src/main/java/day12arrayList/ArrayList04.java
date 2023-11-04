package day12arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {

        //Bir liste olusturmak icin kisa yol
        List<Integer> list = Arrays.asList(4,5,13,313,353);
        System.out.println(list);//[4, 5, 13, 313, 353]

        //list.remove(0);
        //list.add(63);
       //list.clear();
        /*
        Note: Arrays.asList() methodunu kullanarak bir list olusturursaniz
        Listin öge sayisini degistiren methodlari kullanamazsiniz
        örnegin remmove(), add(), clear() kullanilmaz
        ama set() kullanabilirsiniz
         */
        list.set(1,63);   //set methodda sadece index girilir

        System.out.println(list.size());
        System.out.println(list);


    }
}
