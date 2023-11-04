package day09Loops;

public class C05DoWhileLoop01 {
    public static void main(String[] args) {
         /*
        while loop
        baslangic degeri
        while(loop calisma kurali){
            calisacak kodlar
            artirma / azaltma
         */
        /*
        do While Loop
        baslangic degeri
        do{
        calisacak kodlar
        artirma / azaltma
        }while(loop calisma kurali);
         */

      // 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdir
        int i =5;
        do {
            System.out.println(i);
            i--;
        }while (i>2);
        //------------------------------------------------------------------------
        // 1) while loop
        int a= 1;
        while (a<1){
            System.out.println("Sen bir while loopsun....");
            a++;
        }


        //2) do-while loop

        int b = 1;
        do {
            System.out.println("sen bir do while loopsun");
            b++;
        }while (b<1);


        //while loopda body hic calismadi
        //while loop da zero execution mümkündür
        //do while loopda body calisti
        //do while loop kullandiginizda loop body en az bir kere calisir
        //do while loop da zero execution mümkün degildir




    }
}
