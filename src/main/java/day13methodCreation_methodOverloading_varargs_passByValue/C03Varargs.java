package day13methodCreation_methodOverloading_varargs_passByValue;

public class C03Varargs {
    public static void main(String[] args) {

        int result = add(1,2,3,4,5,6);
        System.out.println(result);

        add(); //hic deger girilmesede kabul eder.




    }


    public  static int add(int... a){
        int sum = 0;
        for (int w : a ) {
            sum=sum+w;
        }
        return sum;

    }
        //1) bir method parantezinde birden fazla Varargs kullanilamaz
        //2) bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir.


    // Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz.
    //Varargs arka planda Array yapisini kullanir.
    //toplama islemi yapan bir method olusturun
    /* public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b,int c) {
        return a + b + c;
    }
    public static int add(int a, int b,int c, int d) {
        return a + b + c + d;
    } */



}
