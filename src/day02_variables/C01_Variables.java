package day02_variables;

public class C01_Variables {

    public static void main(String[] args) {
        /*
        uzun yorumlar bu şekilde hapılır
        */

        // bir variable olustururken icerisine koyacagim datanin alabilecegi degerlere uygun
        // bir data turu saecmeliyiz
        // ornegin bir sehrin nufusundan bahsediyorsak
        // variable'imizin data turu String, boolean, char veya double olamaz
        // geriye kalan tamsayi turlerinden sehrin nufusunu icine alabilecek buyuklukte bir data turu seceiliriz
        // biz kurs boyunca genelde tam sayilar icin int, ondalikli sayilar icin double kullanacagiz

        int level=1;
        System.out.println(level);

        boolean öğrenciMi= true;
        boolean yağışVarMı= false;

        char sayı='2';
        char harf='B';
        //char tek bir şey yazılır ve tek tırnak içinde yazılması lazım//

        System.out.println(harf);
    }

}
