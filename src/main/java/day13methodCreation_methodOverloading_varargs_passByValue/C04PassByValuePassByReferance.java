package day13methodCreation_methodOverloading_varargs_passByValue;

public class C04PassByValuePassByReferance {
    public static void main(String[] args) {

        int x = 3;
        int y = 5; //orijinal degerler hafizada degismeden kalir

        add(x,y); // buraya gelemler kopyadir

    }

     /*
    Pass By Value :
        1) Java Pass By Value kullanir
        2) Yani java methodlarin orjinal degeri degistirmesine müsade etmez
        3) java methodlara deger yollarken orjinal degerin kopyasini olusturur, ve o kopyayi methoda yollar
        Method kopya deger üzerinde degisiklik yapar, böylece orjinal deger korunmus olur

    Pass By Reference:
        1) Pass by Reference da method a reference yollanir
        2) Reference adres demektir. Adress yollaninca method adresi kullanarak orjinal degere ulasir ve orjinal degeri degistirir
     */


    public static int add(int a, int b){
        return a+b;
    }

}
