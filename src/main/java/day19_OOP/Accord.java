package day19_OOP;

public class Accord implements Ac, Engine, Security{
    @Override
    public void cool() {
        System.out.println("Accord cools super");

    }

    @Override
    public void run() {
        System.out.println("Accord runs super");

    }
}
