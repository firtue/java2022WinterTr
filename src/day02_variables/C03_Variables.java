package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Ali";
        ogrenciIsmi="Mehmet";

        System.out.println(ogrenciIsmi);
        //yukarıdan okumaya başladığı için en son verilen değer geçerli olur

        String isim,soyisim,doguYeri;

        isim=  "Erdem";
        soyisim="Ergin";
        doguYeri="İzmir";

        int yas=20,kardesSayisi=4, maas=0;

        System.out.println(kardesSayisi+"  "+soyisim);


        // String non-primitive oldugu icin biz sadece data saklamak degil
        // ekstra bazi ozellikleri de kullanabiliyoruz
        // Eger Tc No, okul numarasi veya Tel numarasi gibi
        // kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        // degerler icin de String kullanilabilir


        String harf= "A";
        char harf2='A';
        // bu ikisi icin de ayni durum gecerli
        // ben A harfi icin bir variable'i char olarak da olusturabilirim String olarak da olusturabilirim
        // Eger sadece saklayacaksak char kullanilabilir ama
        // String'in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olabilir

    }
}
