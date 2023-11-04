package day25_lambda;

import java.util.*;

import static day25_lambda.Lambda02.printElementsExceptStartsWit;

public class Lambda01 {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();
        printMultiplyOfSquareOfDistinctEvenElements(nums);
        System.out.println();
        getMaxValue1(nums);
        System.out.println();
        getMaxValue2(nums);
        System.out.println();
        getMaxValue3(nums);
        System.out.println();
        getMaxValue4(nums);
        System.out.println();
        getMinValue1(nums);
        System.out.println();




    }

    //1a) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Structured)
    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " "); //12 14 10 4 12
            }
        }
    }

    //1b) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(functional)
    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));//12 14 10 4 12
    }

    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
    // koyarak yazdiran method'u olusturunuz.(Functional)

    //81 17161 81 225
    public static void printSquareOfOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));//81 17161 81 225
    }
    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " ")); //729 2248091 3375

    }

    public static void printSumOfSquareOfDistinctEvenElements(List<Integer> nums) {
        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u); //456
        System.out.println(sum);
    }

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin"
    // "toplamını" hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }


    ////5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin"
    // "çarpımını" hesaplayan bir method oluşturun

    public static void printMultiplyOfSquareOfDistinctEvenElements(List<Integer> nums) {
        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(sum);


    }

//6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    public static void getMaxValue1(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().reduce(Integer.MAX_VALUE,(t,u)->t>u ? t : u);
        System.out.println(max);
    }


    public static void getMaxValue2(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);//131

    }
    public static void getMaxValue3(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().sorted().reduce((t,u)->u).get();
        System.out.println(max);//131


    }
    public static void getMaxValue4(List<Integer> nums) {
        int max = nums.
                stream().
                distinct().reduce(Math::max).get();
        System.out.println(max); //131


    }
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().reduce(Math::min).get();
        System.out.println(min); //4


    }

    public static void getMinValue2(List<Integer> nums) {
        Integer min =
                nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).

                        reduce((t,u)->u).get();
        System.out.println(min); //4


    }
    public static void getMinValue3(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        sorted(Comparator.reverseOrder()).
                        reduce((t,u)->t).get();
        System.out.println(min); //4


    }
    public static void getMinValue4(List<Integer> nums) {
        Integer min =
                nums.
                        stream().
                        distinct().
                        reduce((t, u) -> Math.min(t, u)).
                        get();
        System.out.println(min); //4

    }
    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven (List<Integer> nums){
        Integer min = nums.
                stream().
                filter(t-> t>7 && t%2==0 ).
                sorted().
                findFirst().
                get();
        System.out.println(min);

    }











}