package day17_OOP;

public class C06_Cat extends C05_Animal {
    public void meow(){

        System.out.println("Cats meow");
    }

    @Override
    public void eat() {

        System.out.println("Cats eat");
    }

    @Override
    public void drink() {

        System.out.println("Cats drink");
    }
}




