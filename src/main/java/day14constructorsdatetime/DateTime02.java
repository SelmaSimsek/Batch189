package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime); //12:22:23.119785800 lokal ayarlardaki saat görünür

       // myCurrentTime.minusHours(5); localDate deki lerle benzer



                /*
    DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH-mm");
        String formatedTime = dtf1.format(myCurrentTime);
        System.out.println("formatedTime = " + formatedTime);

        //Date objesini formatlayalim
        LocalDate date1 = LocalDate.of(2022,8,28);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formatedDate = dtf2.format(date1);
        System.out.println("formatedDate = " + formatedDate);

        //28/Agustos/20233
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf3.format(date1));

        // baska bir zaman dilimindeki tarih ve zaman nasil aliriz?
        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europa/Amsterdam"));
        System.out.println("dateInAmsterdam = " + dateInAmsterdam);

        // Tokyo da saat kac?
        LocalTime timeinTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeinTokyo = " + timeinTokyo);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd / MMM / yyyy - HH:mm");
        String formatedldt = dtf4.format(ldt);







    }
}
