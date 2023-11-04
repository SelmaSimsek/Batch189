package day19_OOP;

public interface Ac {

    /*
    1) Bir interface i bir class in parenti yapmak icin imlement keywordunu kullaniriz.
    2) Java parentler class oldugunda multiple parent a müsaade etmez ama biz bazen multiple parent a
    3)
    4) interface lerdeki tüm methodlar otomatik olarak public dir, abstractir, static dir
    5)
     */

    int price = 2000;

    public abstract void cool();

    void run();

    default void eco(){
        System.out.println("uses gas less...");
    }



}




