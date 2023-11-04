package day17_OOP;

public class C03_Honda extends C02_Car {
    public C03_Honda() {



        System.out.println("super.km = " + super.km);
        System.out.println("super.model = " + super.model);
        System.out.println("this.model = " + this.model);
        System.out.println("this.km = " + this.km);
        System.out.println("Honda1");
    }

public C03_Honda(String model, int year){
    System.out.println("Honda 2");
}



public String model = "Civic";

public int km =10000;
}