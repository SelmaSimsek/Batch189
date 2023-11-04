package day16_staticOop;

public class C02_StudentRunner {
    public static void main(String[] args) {
         //stdName static oldugundan ona ulasmak icin object olusturmadim
        //static class memberlara ulasmak icin sadece class ismi yeterlidir
        //
        System.out.println(C01_Student.stdName);

        // age non static oldugundan ona ulasmak icin object olusturmak zorundayiz
        C01_Student ali = new C01_Student();
        System.out.println(ali.age);


        C01_Student.staticMethod();
        ali.nonStaticMethod();






    }
}
