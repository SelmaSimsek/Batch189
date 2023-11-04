package day24_enum_iterator_lambda;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {
        Cities hatay = Cities.HATAY;
        System.out.println(hatay);

        //Adana sabitinin ismine ulasalım

        String adanaCityName = Cities.ADANA.getCityName();
        System.out.println(adanaCityName);

        String ankarapostalCode = Cities.ADANA.getPostalCode();
        System.out.println(ankarapostalCode);
        int sinopplakaCode = Cities.SİNOP.getPlateCode();
        System.out.println(sinopplakaCode);

        //Kullanıcıdan bır ılın plaka kodunu alarak bunun hangı ıl oldugunu console a zaydırın
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Plaka kodunu giriniz");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir Array icinde verir
        Cities cities[] = Cities.values();
        System.out.println(Arrays.toString(cities));

        if (plaka>81 || plaka<1){
            System.out.println("Girmis oldugunuz plaka gecersizdir");
        }else
        for (Cities w:cities) {
           if (plaka==  w.getPlateCode()){
               System.out.println("Girmis oldugunuz plaka "+ w.getCityName()+ " iline aittir");
               break;
           }

        }













    }
}
