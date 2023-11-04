package day23.Exceptions;

public class E03 {
    public static void main(String[] args) {
        /*
        1) Exceotion olsada olmasada calistirilmasi gereken kodlar var ise eger "finally block" icine yazariz
        2) Database ile baglantiyi kesme isini yapan kodlar gibi her halikarda calistirilmalidir
        iste bu tarz kodlari finaly block icine koyariz
        3) try tek basina kullanilmaz: try+1 catch, try + cok catch olur
            try ile coklu catch ve finally block kullanilir
        4) coklu finally blok kullanilamaz

         */

        int a = 12;
        int b = 4;
        int c[] = {3, 5, 7, 9};
        getNumberFromIntArray(c,a,b);


    }

    public static void getNumberFromIntArray(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with Database");
        }
    }
}