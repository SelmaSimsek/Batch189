package day18_OOP;

public class StudentRuuner {
    public static void main(String[] args) {
        Student ali = new Student();
        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());

        System.out.println("=================");

        ali.setStdId("VH1234567");
        ali.setNotOrt(3.13);
        ali.setSuccesful(true);

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());

        System.out.println("================");

        ali.setStdId("TH1234567");
        ali.setNotOrt(4.4);
        ali.setSuccesful(true);

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());


    }
}
