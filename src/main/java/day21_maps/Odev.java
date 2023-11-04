package day21_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Odev {
    public static void main(String[] args) {
        //Ödev
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String str = "Hello Henry!";
        str = str.replaceAll("\\p{Punct}","").replaceAll(" ","");
        String strarr [] = str.split("");
        System.out.println(Arrays.toString(strarr)); //[H, e, l, l, o, H, e, n, r, y]

        TreeMap<String,Integer> strHarf = new TreeMap<>();
        for (String w:strarr) {

            Integer harfKontrol = strHarf.get(w);

            if (harfKontrol == null){
                strHarf.put(w,1);
            }else {
                strHarf.replace(w,harfKontrol+1);
            }
        }
        System.out.println(strHarf);
    }
}
