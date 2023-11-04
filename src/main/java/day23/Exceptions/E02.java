package day23.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {
        /*
        1) FileNotFoundException ve IoException Compile Time Exception lardir. yani codu yazarken hata aliriz
        2) FileNotFoundException path in dogrulugu ve dosyanin varligi ile ilgilidir
            IOException tum input ve output islemleri ile ilgilidir
        3) IOException Classs, FileNotFoundException classin parent idir
            istenirse FileNotFoundException yerin IOException da kullanilabilir
        4) IOExcepton Class ve FileNotFoundException beraber kullanilacak ise FileNotFoundException üstte olmalidir
         */

        try {
        FileInputStream fis = new FileInputStream("src\\main\\java\\day23\\Exceptions\\file.txt");
        int k =0;
        while (true) {

            System.out.print((char) k);
        }
        } catch (IOException e) {


        }
    }
}
