package day11multiDimensionalArrays;

import java.util.Arrays;

public class C02Md01 {
    public static void main(String[] args) {
        //Multi Dimensional Arrays = Cok boyutlu Array
        //Bir Array in elemanlari eger Array ise, bu Array ler multidimension arrays olarak adlandirilir.

        //Multidimensional Array nasil olusturulur?
        //data type i basta int yazildigi icin, bütün elemanlar int olmak zorundadir
        int a [] [] = new int [3] [2] ;

        //Multidimensional Array lere nasil eleman eklenir?
        a[0][0]= 5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //Multidimensional Array nasil console a yazdirilir?

        System.out.println(Arrays.toString(a));//[[I@43a25848, [I@3ac3fd8b, [I@5594a1b5]
        //Multidimensional Array leri yazdirirken toString() methodu degil,
        // deepToString() methodunu kullaniriz
        System.out.println(Arrays.deepToString(a));//[[5, 12], [81, 45], [123, 0]]

        //Multidimensional Array den spesific bir eleman nasil yazdirilir?
        System.out.println(a[1][0]); //81

        //Multidimensional Array icindeki bir Array nasil yazdirilir?
        System.out.println(Arrays.toString(a[1])); //[81,45]

        //kisa yoldan  Multidimensional Array nasil olusturulur?
        String students [][] = {{"Ali","Ahmet"},{"Cemal"},{"Ayhan","Beyhan","Seyhan",},{"Ceyhan,Kayahan"}};

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        
        int sum= 0;

        for (String [] w:students) {
            sum = sum+w.length;
            
        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde
        // icinde "m" olan isimleri console'a yazdiriniz

        for (String [] w :students) {

            for (String k: w) {
                if (k.contains("m")){
                    System.out.println(k); //Ahmet Cemal
                }

            }

        }



    }
}
