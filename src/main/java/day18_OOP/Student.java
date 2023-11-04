package day18_OOP;

public class Student {
    //Encapsulation - kapsülleme
    /*
    Encapsülation nedir? Data hiding (Veri saklamak)
    data nasil saklanir?
    Access modifier larini private yaparak datayi diger classlardan görünmez hale getiririm
    böylece datayi saklamis olurum

    Encapsulation yaptigimmiz datayi istersek diger classlardan okuyabiliriz
    nasil okuruz
    get method olusturarak Encapsulate edilmis datanin degerini okuyabiliriz

    1)get methodlar public olur
    2) get methodun return type i her zaman okudugu variable ile ayni olur
    3) get method bir boolean variable icin olusturulduysa, ismi is ile baslar
    4) get methodlarin ismi her zaman get ile baslar


    Encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirebiliriz?
    set method olusturarak Encapsulate edilmis datanin degerini degistirebiliriz

    1) set methodlar public olur
    2) set methodun return type i hep void olur
    3) set method parametre kullanir, parametrelerin data type i set edilmek istenen variable
    ile ayni olur





     */

public String stdName = "Ali Can";
public int age = 17;
private  String stdId = "AC1234567";
private  double notOrt = 3.87;
private boolean succesful = false;


    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
