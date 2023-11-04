package day22_map_Exception;

public class E04 {
    public static void main(String[] args) {
        String arr [] = {"j","a","v","a"};
        getElementFormatArray(arr,1);
        getElementFormatArray(arr,5);

    }
    //Array lerde olmayan bir index kullanildiginda Java, ArrayIndexOutOfBoundsException atar
    public static void getElementFormatArray (String[]s, int idx){
        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); //Index 5 out of bounds for length 4
            System.err.println(e.getCause()); //null

        }

    }
}
