package day06SwichTernaryString;

public class C04StringManipulations01 {
    public static void main(String[] args) {

        String s = "Java is easy";
        //"s" String inde kullanilan charakter sayisini bulunuz

        int slength= s.length();
        System.out.println(slength);

        // "s" String indeki ilk indexte bulunan charakteri
        // ve son indexte bulunan karakteri aliniz

        char firstchar = s.charAt(0);
        System.out.println(firstchar); //J

        char lastchar = s.charAt(11);
        System.out.println(lastchar); //y

        char lastchar1 = s.charAt(s.length()-1);
        System.out.println(lastchar1); //y

        //Dinamik: kodlarin tüm senaryolar icin calismasi demektir.

        // Not 1:index her zaman 0 dan baslar bu nedenle
        //charAt(0) her zaman ilk index i verir
        //not 2: index no olarak s.lenght()-1 girersek
        // bu bize dynamik olarak her zaman son index i verir

        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil,
        // "4" yani ikinci index haric dir. [0,4)

        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Example 4: "s" String'indeki "is" kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        // 2.yol:
        //Bir charakterden baslayarak sonuna kadar almak isterseniz
        //o zaman tek parametreli kullanabilirsiniz

        String sub4 = s.substring(8);
        System.out.println(sub4);

        //"s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz
       boolean isExist = s.contains("easy");
       System.out.println(isExist);

        //Example 7: "s" String'inin belli bir harfle
        // baslayip baslamadigini kontrol ediniz.

        boolean isStart= s.startsWith("Java");
        System.out.println(isStart);

        //s stringinin easy ile bitip bitmedigini kontrol ediniz


        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);





    }
}
