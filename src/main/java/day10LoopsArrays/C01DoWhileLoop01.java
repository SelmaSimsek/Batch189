package day10LoopsArrays;

import java.util.Scanner;

public class C01DoWhileLoop01 {
    public static void main(String[] args) {
        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        Scanner input = new Scanner(System.in);

        int counter = 0;


        do {

            if(counter==4){
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }
            System.out.println("Lütfen Username i giriniz");
            String userNAme = input.next();

            System.out.println("Lütfen Password u giriniz");
            String password = input.next();

            if (userNAme.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza hosgeldiniz");
                break;
            }
            counter++;


        }while (true);
    }
}
