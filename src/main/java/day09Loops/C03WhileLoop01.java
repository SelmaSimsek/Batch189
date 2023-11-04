package day09Loops;

public class C03WhileLoop01 {
    public static void main(String[] args) {

        /* for loop
        for (baslangic degeri ; loop calisma kurali ; artirma/azaltma){
        calisacak kodlar
        }
         */

        /*
        while loop
        baslangic degeri
        while(loop calisma kurali){
            calisacak kodlar
            artirma / azaltma
         */
       // example:3 den 6 ya kadar tama sayilari konsola yazdirin
        for (int i = 3; i <7 ; i++) {
            System.out.print(i);

        }
        System.out.println();

        //2.yol
        int i = 3;
        while (i<7){
            System.out.println(i);
            i++;
        }

        // 23'den 12'ye kadar cift tamsayilari console#a yazdiriniz
        int k = 23;
        while (k>11){
            if (k%2==0){
                System.out.println(k);
            }
            k--;
        }

    }

}
