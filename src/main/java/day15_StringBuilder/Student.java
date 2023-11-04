package day15_StringBuilder;

public class Student {
    // Access Modifier
    /*
    1)Public
    2)protected
    3)default
    4)private

    Public > protected > default > private

public      ==>  public olanlar her class dan kullanilabilir
        protected   ==> protected olanlar baska package lardan kullanilamaz, ancak baska package larda
                        child classlar icinden kullanilabilir
        default     ==> default olanlar baska package lardan kullanilamazlar
        private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

        "protected ile default" arasindaki farki söyleyiniz?
        Note ==> protected olanlar baska package lardan kullanilamaz ancak ancak baska package larda
                        child classlar icinden kullanilabilir
                  default olanlar baska package lardan kullanilamazlar
     */



    //her glass tan kullanilabilir
    public  String stdNAme = "Ali CAn";

    //protected olanlar baska packege dan child classlardan görülebilir
    protected String adress= "Istanbul";

    //default acsess modifier larda default keyword yazilmaz
    //default olanlar baska package lardan kullanilamaz
    //default String email = "alican@gmail"
    String email = "alican@gmail";

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler
     private  String ssnId="1234567891";





}
