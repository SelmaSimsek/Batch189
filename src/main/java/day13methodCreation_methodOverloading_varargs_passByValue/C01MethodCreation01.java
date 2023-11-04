package day13methodCreation_methodOverloading_varargs_passByValue;

public class C01MethodCreation01 {
    public static void main(String[] args) {

        int carpmaSonucu = multiply(3,5);
        System.out.println("carpmaSonucu = " + carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(3, 5, 4));

        print("Ali Can");


    } // main method sonu

    //2 sayiyi carpma islemi yapan bir method olusturunuz

    protected static int multiply(int a, int b) {
        return a * b;
    }

    private static int firstTwoMultiplyThirdAdd (int a,int b,int c){
        return a*b+c;
    }

    //Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    public static void print(String str){
        System.out.println(str);

    }





}//class sonu
