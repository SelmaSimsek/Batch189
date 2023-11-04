package day20_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> depo = new LinkedList<>();
        depo.add("süt");
        depo.add("et");
        depo.add("yumurta");
        depo.add("peynir");
        System.out.println(depo);//[süt, et, yumurta, peynir]

        depo.remove();
        System.out.println(depo);//[et, yumurta, peynir] ilk girileni siler

        depo.peek();
        System.out.println(depo);

        depo.clear();
        System.out.println("depo = " + depo);
        System.out.println(depo.poll());//null
       // System.out.println(depo.element());//hata verir
        System.out.println(depo.peek());//null

        Queue<String> wareHause = new PriorityQueue<>();
        wareHause.add("Milk");
        wareHause.add("Meat");
        wareHause.add("Egg");
        wareHause.add("Orange");
        wareHause.add("Tomatoes");
        System.out.println(wareHause);//[Egg, Milk, Meat, Orange, Tomatoes]

        //Double ended queu ==> iki uclu queu
        Deque<String> d= new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);//[Milk, Meat, Egg, Orange, Tomatoes]




    }
}
