package day05IfStatementsSwitchTernary;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        /*Kullanicinin vermis oldugu gün isimlerine bakarak
        Haftasonu veya Hafta ici olduguna karar veren
        kodu yaziniz
        Monday==Week Day        Saturday ==Weekend Day
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName = input.next();

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday")||dayName.equalsIgnoreCase("Sunday");


       boolean isWeekDay = dayName.equalsIgnoreCase("Monday")||dayName.equalsIgnoreCase("Tuesday")
                ||dayName.equalsIgnoreCase("Wednesday")||dayName.equalsIgnoreCase("Thursday")
                ||dayName.equalsIgnoreCase("Friday");

       if (isWeekendDay) {
           System.out.println("Weekend Day");
       } else if (isWeekDay) {
           System.out.println("Week Day");
       }else {
           System.out.println("Invalid day name");
       }







    }
}
