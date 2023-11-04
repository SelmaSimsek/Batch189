package day16_staticOop;

public class C04_InstanceBlock {

    //eger tüm constructor larin icinde calismasi gereken kodlar var ise
    // tekrardan kurtulmak icin bu kodlari
    //instance block icine yazariz

    public  int year;

    public C04_InstanceBlock() {

    }

    public C04_InstanceBlock(int year) {
        this.year = year;
    }

    {
        System.out.println("Hi");
        //eger tüm tekrarlardan kurtulmak istiyorsak
    }



}
