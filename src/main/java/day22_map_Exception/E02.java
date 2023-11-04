package day22_map_Exception;

public class E02 {
    public static void main(String[] args) {
        String s ="1234a";
        converStringToInt(s);

    }
    // icinde rakamlar disinda bir karakter olan stringi sayiya cevirmek isterseniz Java NumberFormatException atar


    public static void converStringToInt(String s){
        try{
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1);
        }catch (NumberFormatException e){
            System.out.println("Bir stringin sayiya dönüstürülebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }

    }
}
