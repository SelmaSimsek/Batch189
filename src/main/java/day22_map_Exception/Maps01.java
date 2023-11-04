package day22_map_Exception;

import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {
        //HashMap arkasinda calisan mekaizma

        HashMap<String,String>capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.get("USA");

        capitals.put("Italy","Roma");
        capitals.put("Türkiye","Ankara");


    }
}
