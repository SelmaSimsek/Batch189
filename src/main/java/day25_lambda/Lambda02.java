package day25_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        printElementsExceptStartsWit(myList);
        System.out.println();
        printDistinctElementLeghtLessThanFive(myList);
        System.out.println();
        List<String> newList = getElementLenghtMoreThanFiveWithUpperCase(myList);
        System.out.println(newList);
        printElementLenghtLessThanFiveUniqueLowerCase(myList);
        System.out.println();
        printElementUniqueToUpperCaseSorted(myList);
        System.out.println();


    }
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElementsExceptStartsWit(List<String>myList){
        myList.stream().filter(t-> !t.startsWith("E")).
                forEach(t-> System.out.println(t+" "));

    }

    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari
    // tekrarsiz olarak console'a yazdiran method'u olusturunuz.

    public static void printDistinctElementLeghtLessThanFive (List<String>myList){
        myList.stream().distinct().filter(t-> t.length()<5).
                forEach(t-> System.out.println(t+" "));

    }
    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk
    // harflerle bir listin icinde veren method'u olusturunuz.

    public static List<String> getElementLenghtMoreThanFiveWithUpperCase (List<String>myList){
       return myList.stream().filter(t-> t.length()<5).
               map( String::toUpperCase).collect(Collectors.toList());

    }
    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.

    public static void printElementLenghtLessThanFiveUniqueLowerCase(List<String>myList){

        myList.stream().distinct().
                filter(t-> t.length()>5).
                map(String::toLowerCase).sorted().
                forEach(t-> System.out.println(t+" "));


    }
    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElementUniqueToUpperCaseSorted (List<String>myList) {

        myList.stream().distinct().
                map(String::toUpperCase).sorted().
                forEach(t -> System.out.println(t + " "));

    }
    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge
    // siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElUniguelLowerCaseSortWithLenght(List<String>myList){
        myList.stream().distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(t-> System.out.println(t+" "));

    }









}
