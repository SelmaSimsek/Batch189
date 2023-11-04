package day11multiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01Arrays01 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
        int a [] = {0, 2, 3, 0, 12, 0};

        int b [] = new int[a.length];

        int idx = 0;

        for (int w:a) {      // 0  degilse basa yerlestirir
            if (w!=0){
                b[idx]=w;
                idx++;
            }

        }
        System.out.println(Arrays.toString(b)); //[2,3,12,0,0,0]

        ///Arraylarin esit olup olmadigi nasil anlasilir?

        int arr [] = new int[3];
        arr[0]=2;
        arr[1]=1;
        arr[2]=3;

        int brr[]= new int[3];
        brr[0]=2;
        brr[1]=3;
        brr[2]=1;

        //iki Array in ayni olabilmesi icin ayni indexte ayni elemanlarin bulunmasi gerekir
        boolean result = Arrays.equals(arr,brr);
        System.out.println("result = " + result);





    }
}
