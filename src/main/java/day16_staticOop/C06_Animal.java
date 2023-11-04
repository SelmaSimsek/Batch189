package day16_staticOop;

public class C06_Animal {

    /*
    oop cansept te 4 prensip vardir
    1)Inheritance /Miras
    2)Polymorphism / polimorfizn
    3)Encapsulation / kapsülleme
    4)Abstraction /soyutlama
     */

    //Inharitance:
    /* özellikleri bir classtan diger classlara alan bir kavramdir, Mesela; siz bir class olusturacaksiniz
    ama daha önce olusturulmus bir class sizin istediginiz özelliklerin bir cogunu kapsiyor. o zaman
    olusturdugumuz classin özelliklerini kullanmak istedigimiz class a child yapariz

        1)Inheritance sayesinde
        a) Code tekrarlarindan kurutuluruz
        b) Code tamiri(maintenance) kolay olur
        c) Child Class'lari daha atomic yapmis oluruz

   2) Bir class'i baska bir classin child class i yapmak icin
   extends keywordunu kullaniriz.
   3) Child class objectleri Parent class tan method ve variable lari kullanabilirler
   4) Parent class objectleri child class dan method ve variable lari kullanamazlar
    5) Java da bir classin sadece bir tane parenti olabilir, coklu parent a Multiple Inheritance derler
        tekli parent a Single inheritance derler, java Multiple inheritance i desteklemez, single inheritance kullanir.
    6) Apartman seklindeki Inheritance yapisina "Multilevel Inharitance" denir
    7)Object class her classin parent idir. Java da object class haric her classin parenti vardir
    8) java da parentten child  a olan iliskilere HAS A Relationship denir
         java da child tan parent a olan iliskilere IS A Relationship denir
    9) Java da her class in bir tane default contructur i vardir. ama bu constructor clasin icinde görünmez
    cünkü default constructor "Object Class" icindedir.




     */

        //parent = super   /    Child=sub
    //extends : bu keyword ile java kimin parent, kimin child oldugunu anlar
    // IS A relationship: child dan parent a dogru bir akis
    //HAS A Relationship: parentten child a dogru gidis




    public void eat (){

        System.out.println("Animals eat");
    }

    public void drink(){

        System.out.println("Animals drink");
    }













}
