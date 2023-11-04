package day04ScannerIncrementDecrementIfStatements;

public class C05IncrenmentDecrement {
    public static void main(String[] args) {

        //Increment
        int a = 5;
        System.out.println(a);
        a = a+2; //7
        System.out.println(a);
        a+=2; //9
        System.out.println(a);

        //Decrement
        int b = 8;
        System.out.println(b);
        b =b-3;
        System.out.println(b);
        b-=3;
        System.out.println(b);

        //Increment 2

        int d = 6;
        System.out.println(d);
        d= d*2;
        System.out.println(d);
        d*=2;
        System.out.println(d);

        //Decrement 2

        int e = 24;
        System.out.println(e);
        e=e/2;
        System.out.println(e);
        e/=2;
        System.out.println(e);
        //1 ile increment
        int f = 13;

        //f=f+1;
        //f+=1;
        f++;

        //1 ile decrement
        int h = 9;
        //h = h - 1;
        // h -= 1;
        h--;


        //post-increment   /  pre-increment

        int i =10;
        int k = i++;
        System.out.println("i = " + i);//10 i arttirilmadan k ya konuldugu icin
        System.out.println("k = " + k); //



        int m = 15;
        int n = ++m;
        System.out.println("n = " + n); // 16 m satir sonunda arttirildigi icin m nin degeri 16 olur
        System.out.println("m = " + m); // 16 m arttirildiktan sonra n ye konul

        int p = 17;
        int r = p--;

        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;

        System.out.println(s);
        System.out.println(t);






















    }
}
