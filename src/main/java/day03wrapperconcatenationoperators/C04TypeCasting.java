package day03wrapperconcatenationoperators;

public class C04TypeCasting {
    public static void main(String[] args) {
        /*
        Numeric primitive data type larin birbirine dönüsturulmesine Type Casting denir
        Numeric (sayisal) Data Type==> byte -   short   -   int -   long    -   float   -   double


        Note: Kücük data type larini büyük data type larina cevirmeyi java otomatik olarak yapabilir
        bu isleme "AutoWidening" (Otomatik genisletme) denir
        Note: Büyük data typelarini kücük data typelarina cevirmek riskli bir ister
        java bu riski otomatik olarak yapmaz. Bu islemi kod yazanlar yapar. "Explicit Narrowing" (Aciktan Daraltma) denir.

         */

        //byte data type ini int data type ina cevirin.
        byte age = 13;
        int ageint = age;
        // int data type ini short data type ina ceviriniz
        int weight = 313;
        short weightShort = (short)weight; //Explicit Narrowing



    }
}
