package day22_map_Exception;

public class E06 {
    public static void main(String[] args) {
        String s = "Java";
        getNumberOtChar(s);

        String t = "";
        getNumberOtChar(t);

        String u = null;
        getNumberOtChar(u);


    }
    //  Stringin degeri null oldugu zaman String klastaki metodlari kullanamazsiniz
    //  Cünkü Java NullPointerException atar
    public static void getNumberOtChar(String s){

        try {
            int numOfChars = s.length();
            System.out.println(numOfChars);
        } catch (Exception e) {
            System.err.println("null degeri icin String methodlari kullanilamaz");
        }

    }
}
