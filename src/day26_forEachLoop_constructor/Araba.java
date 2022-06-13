package day26_forEachLoop_constructor;

public class Araba {
    /*
    Java'da her Class oluşturduğumuzda Java o class'dan ileride
    objeler üretmek gerekeceğini bilir ve biz özellikle
    belirtmesek de Java her oluşturduğu class'a constructor koyar

    Java'nın class oluştururken class'a koyduğu constructor'a
    DEFAULT CONSTRUCTOR denir ve bu constructor görünmez

    Eğer biz görünür bir constructor'imiz olsun istersek
    default constructor ile aynı görevi yapan bir constructor oluşturbiliriz
    veya istersek aynı kalıptan farklı desenlerde objeler oluşturmak için
    farklı özelliklerde constructorlar da oluşturabiliriz

    constructor'ları birbirinden farklılaştıran tek arıcalık
    kullanılan parametre sayısı ve parametre data türüdür
    */

    public Araba(){
        System.out.println("Parametresiz constructor çalıştı");
    }

    /*
    bir kod bloğunun method veya constructor olmasından emin olmak istiyorsanız
    iki şeye dikkat etmelisiniz
    1- Constructorlar'ın ismi class ismi ile aynı olmak zorundadır
       yani büyük harfle başlar
    2- Constructorlar'ın return type'ı olmaz

    Özetle; constructor'ın adı class adı ile aynı olmalı ve
            return type'ı olmamalı
    */

    public Araba (String renk){
        System.out.println(renk+" rengindebir araba üretildi");
    }

    public Araba(int yil){
        System.out.println(yil + " model bir araba uretildi");
    }

    public Araba(int yil, String renk){
        System.out.println(yil + " model " + renk + " renginde bir araba uretildi");
    }


}
