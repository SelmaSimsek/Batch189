package day19_OOP;

public abstract class Courses {

    //Abstraction
    /*
    1) Eger bir class tan object olusturulmasini istemiyorsak ve bu classi sadece child classlarin
    yapmak zorunda olduklari görevleri belirlemek icin kullaniyorsak "Abstraction" yapariz
    2) Bazen parent class daki methodun body si hicbir child class tarafindan kullanilmaz. bu durumda
    parent taki methoda body yazmak hic kullanilmadigi icin mantikli degildir. biz de o methoda body yazmayiz.
    3)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak javaya
    bu methodun body si olmayacak deriz
    4)4) Abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz,
    o yüzden classi da abstract yapmaliyiz
    5) Parent taki method abstract ise butun concrete child classlar o methodu override etmek zorundadir
    Bu yüzden tum child lar icin mecburi olmasini istedigimiz methodlari abstract yapariz
    6) Body si olan methodlar(concrete) abstract classlarin icine yazilabilir Abstract methodlar
    concrete classlarin icine yazilamazlar. Concrete methodlar child classlar tarafindan override edilmek zorunda degildir
    7) abstract keyword ile method body, bir methodda ayni anda kullanilamaz
    8) final methodlar abstract olamazlar. cunku final methodlar override edilemezler.
    halbuko abstrackt methodlar override edilmek icin olusturulurlar. bu celiskiler dolayisiyla
    9) abstract classlarin icinde abstract methodlar olur, abstract methodlar body si olmadigindan eksik methodlar gibi düsünülebilir
    yani abstract class icinde eksik yapi barindirir. bu nedenle java applicationu korumak icin
    abstract classlardan object olusturulmasina izin vermiyor
    10) abstract classlarin constructorlari vardir ama object olusturamazlar
    11) abstract class in abstract childi veya concrete childi olabilir. Eger child abstract
    ise abstract methodlari override etmek zorunda degildir, concrete ise override etmek zorundadir
    12) abstract methodlar private olamazlar cunku child classlar abstract methodlari override etmek zorundadirlar
    private yapinca kullanima kapali olur, Bu celiskidir, dolayisiyla java abstract methodlarin private olmasina müsaade etmez
    13) classlar final oldugunda child classa sahip olamazlar. Ama abstract classlar icin child class olmalidir
    cunku child classlar abstract parent taki methodlari kullanirlar. Bu yüzden java abstract classlarin final
    olmasina müsaade etmez
     */

    public abstract void math();

   // public final abstract void sience();

    public void art(){
        System.out.println("Learn art");

    }




}//class sonu
