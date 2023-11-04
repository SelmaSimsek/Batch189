package day16_staticOop;

public class C10_AnimalRunner {
    public static void main(String[] args) {
       C07_Cat c1 = new C07_Cat();
       c1.drink();
       c1.eat();
       c1.meow();

       C08_Dog d1 = new C08_Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        C09_Bird b1 = new C09_Bird();
        b1.eat();
        b1.drink();
        b1.tweet();
    }
}
