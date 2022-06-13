package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1= 879;
        double sayi2= 10;


        double sayi3= sayi1/sayi2;  //87.9
        System.out.println(sayi3);

        // int sayi4= sayi1/sayi2;
        // değer (sayi1/sayi2) double, variable(sayi4) int
        // yani variable daha dar, küçük dolayısıyla java bunu otomatik olarak yapmaz
        // sorumluluğu üstlenmemizi ister;

        int sayi4= (int) (sayi1/sayi2); //87.9 // Sağ tarafa yazdığımız (int) sorumluluk bende demek

        System.out.println(sayi4);  //87 (int olduğu için noktadan sonrasını yazmaz)


        int sayi5 = 140;
        //byte sayi6= sayi5; OLMAZ  --> sağ taraftaki değer int > sol taraftaki variable byte
        byte sayi6= (byte) sayi5;

        System.out.println(sayi6); //-116

        //byte sınırları şunlardır -128 ve 127 arası
        //byte sınırslarının dışına çıkamadığı için 127 dolduktan sonra -128'e döner ve eksiden artıya dolmaya başlar
        //bir küçük kova doluyor diğerine kalan yazılıyor

        sayi5= 129;
        sayi6= (byte) sayi5;
        System.out.println(sayi6);  //-127

        sayi5= -130;
        sayi6= (byte) sayi5;
        System.out.println(sayi6);  //126

        sayi5= 260;
        sayi6= (byte) sayi5;
        System.out.println(sayi6);  //4
    }
}
