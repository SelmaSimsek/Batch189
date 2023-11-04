package day22_map_Exception;

public class E03 {
    public static void main(String[] args) {
        String s = "Java";
        getCharFromString(s,2);
        getCharFromString(s,5);

    }
    // stringlerde var olmayan indexler kullanildiginda Java, StringIndexOutOfBoundsException atar
    public static void getCharFromString(String s, int idx){

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index kullanma hatasi yaptiniz.. "+ e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace(); //konsolda cikan bütün hatayi yazdirir
            System.out.println("PrintStackTrace sonrasi kodlar calismaya devam eder");

        }


    }
}
