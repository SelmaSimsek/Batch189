package day05IfStatementsSwitchTernary;

public class C06Switch {
    public static void main(String[] args) {

        //Gün isimlerini verince kacinci gün oldugunu yazdiran kodu yaziniz.

        String dayName = "Friday";
        if (dayName.equalsIgnoreCase("Sunday")){
            System.out.println("1");

        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println("2");

        }else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println("3");

        }
        else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println("4");

        }else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println("5");

        }else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println("6");

        }else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println("7");

        }

        // 2.yol
        switch (dayName.toLowerCase()){
            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Gecerli gün ismi giriniz");
        }

    }//main method sonu
}
