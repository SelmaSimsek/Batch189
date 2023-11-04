package day23.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class E01 {
    public static void main(String[] args) throws IOException {
        /*
        1) Run Button' a bastiktan sonra console da alinan Exception lara Runtime Exceptoin denir
        AritmeticException, NullPointerExceptoin vs...
        RunTime Exception lara Unchecked Exceptoin da denir.

        2) Code yazarken kirmizi alt cizgi seklinde alinan Exceptionlar da vardr. Bunlara CompileTime Exception
        denir, Compile Time Exception lara Checked Exception da denir

        3) Throw ile Throws arasindaki farklar nelerdir?
        1) throw method body si icinde, throws ise method parantezinden sonra kullanilir
        2) throw method body si icinde istenilen yerde istenildigi kadar kullanilir
            throws ise method signature dan hemen sonra ve sadece bir kere kullanilabilir
        3) throw dan sonra new keywordu ve constructor kullanilarak object olusturulur
            throws dan sonra ise sadece Exception class ismi yazilir
        4) throw belli sartlar icin Exception firlatmada kullanilir
            throws ise bir methodun belli bir Exception u firlatabilecegini belirtmek icin kullanilir

         */

        FileInputStream fis = new FileInputStream("src\\main\\java\\day23\\Exceptions\\file.txt");
        int k =0;
        while ((k=fis.read())!=-1) {
            System.out.print((char)k);



        }
    }


}






