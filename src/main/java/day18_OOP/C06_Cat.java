package day18_OOP;

public class C06_Cat extends C05_Animal {
    public void meow() {

        System.out.println("Cats meow");
    }

    @Override //override annotation: override kurallarini java tarafindan kontrol etmeyi saglar
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {

        System.out.println("Cats drink");
    }

    @Override
    public C06_Cat creat() {
        return new C06_Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }



}




