package day18_OOP;

public class   C05_Animal {
    //Overriding
    /*  1) Parent classdaki methodu child class icinde özellestirerek kullanmaktir
        2) Overriding de method parantezine, methodun ismine yani method signature a dokunulmaz,
        methodun body si degistirilir.
        3) Parent class ta override edilmis eat() methoduna Overriden Method denir.
           Child class ta override edilmis eat() methoduna Overriding Method denir.
        4) Private methodlar Override edilemez.
        5) child classtaki methodun access modifier i Parent class daki override edilmis (Overriden Method) un access modifier'indan dar olamaz.
        Aynisi olabilir veya daha genis olabilir

        Overriden Method ==> protected --- Overriding method ==> + public
        Overriden Method ==> default --- Overriding method ==> protected + public + default
        Overriden Method ==> private --- Overriding method ==> override olmazki
        6) Child Class da override edilen methodun return type ile parent daki methodun return type iarasinda IS-A iliskisi varsa
    return type degistirilebilir.
        7) Methodun return type i primitive ise Overriding yaparken return type degistirilemez.Cunku return type ya ayni olur
    yada parent tan secelir, ama primitive ler arasinda parent chlid iliskisi olmadigindan parent dan secmek mevzu bahis olamaz
    o zaman tek secenek aynisi olmalidir
    8) Child da override edilen methodun return type i ile parent taki methodun return type i arasinda  IS-A iliskisi yoksa, return type degistirilemez.
     Mesela; Integer wrapper class ile Long wrapper class arasinda IS-A iliskisi yoktur. Dolayisiyla return type Integer oldugunda Long a degistirilemez.
    9) Methodun return type i void ise overriding yaparken return type degistirilemez.
    yani void ise yine void olarak kalmak zorundadir.
    10) Static Methodlar override edilemezler. cunku static methodlar tüm childler icin ortak methodlardir
    Bir child bir ortak methodu degistirdiginde deger childler bundan olumsuz etkilenebilir.
    bu yüzden java static methodlarin override edilmesine izin vermez
    11) final methodlar override edilemezler. final methodlarin body si degistirilemez ama override ederken method body yi degistiririz
    bu bir celiskidir, bu yüzden java final methodlarin override edilmesine müsaade etmez
        a) final keywordunu Variable lar ile kullanabiliriz
           i) eger variable final ise mutlaka deger atanmalidir
           ii) ilk atanan deger degistirilemez

        b) final keywordunu method lar ile kullanabiliriz
            i) eger method final ise body si degistirilemez
            ii) method body si degistirilemeyince override yapmak mümkün olmaz

        c) final keywordunu Class lar ile kullanabiliriz
            i) class final ise o class in child i olamaz (class kisir olur)

    12) Polymorphism = Method Overloading + Method Overriding
    final variable ise deger atanmak zorundadir



     */
    public void eat(){

        System.out.println("Animal eat");
    }

    public void drink (){

        System.out.println("Animals drink");
    }

    public C05_Animal creat(){
        return new C05_Animal();

    }

    public int add(int a, int b){
        return  a+b;
    }
    public Integer multiply(Integer a, Integer b){
        return a*b;
    }
    public final double circelArea(double r){
        return 3.14*r*r;
    }
}
