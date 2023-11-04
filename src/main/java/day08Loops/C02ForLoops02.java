package day08Loops;

public class C02ForLoops02 {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de ilk 'a'
        // harfinden onceki
        // tum character'leri console'a yazdiriniz
        String s = "I love Java";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch== 'a') {
                break;
            }
            System.out.print(ch);

        }
        System.out.println();

            String a="Tramway";

        for (int i = 0; i <a.length() ; i++) {
            if (a.charAt(i)=='w'){
                break;
            }
            System.out.print(a.charAt(i));

        }
        System.out.println();



        //example 2 :Verilen bir String'de
        // kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s1= "Pwd12?Ab";
        for (int i = 0; i <s1.length() ; i++) {
            char ch = s1.charAt(i);
            if (ch>='a' && ch<='z'){
                continue; // loop yaparken bazi elemanlari
                // isleme sokmamak icin continue kullanilir.
            }else {
                System.out.print(ch);
            }

        }

        //break switch disina cikmak icin ve lopu kirmak icin kullanilir
        //continue ise loop yaparken bazi elemanlari isleme sokmamak
        //icin kullanilir

        System.out.println();
        //example 3  Bir String'i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        String t = "Java";
        String ters= "";
        for (int i = t.length()-1 ;i>=0; i--) {
            ters= ters + t.charAt(i);
            System.out.println("ters = " + ters);
        }



        
       /*
        String y = "Java";

        for (int i = 0; i <y.length()-1 ; i--) {
            char c1 = y.charAt(y.length()-1);
            continue;

        }

        System.out.println(y);
        */

        
    }
    
}
