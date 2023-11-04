package day17_OOP;

public class C02_Car extends C01_Vehicle {
    public C02_Car() {
        this("model");
        System.out.println("Car1");

    }
    public C02_Car(String make){
        super();
        System.out.println("Car 2");
    }

    public String model = "Civic";

    public int km =10000;
}
