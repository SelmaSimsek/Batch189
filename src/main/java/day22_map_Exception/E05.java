package day22_map_Exception;

public class E05 {
    public static void main(String[] args) {

        int a= 12;
        int b = 1;
        String s = "My Java";

        getCharFromString(s,a,b);

    }

    public static void getCharFromString (String s, int a, int b){
        try {
            int idx = a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz");
        }
    }
/*
try kisminda birden fazla Exception olusturma ihtimali varsa, coklu catch kullanabilirsiniz
coklu catch kullandiginizda Exception classlar arasinda parent-child iliskisi yoksa catch lerin sirasi önemli degildir
Ama koddaki siralamaya uymak tavsiye edilir
coklu catch kullandiginizda Exception classlar arasinda parent child iliskisi varsa catch lerin sirasi önemli hale gelir
ve child olan class üstte olmalidir

 */
}
