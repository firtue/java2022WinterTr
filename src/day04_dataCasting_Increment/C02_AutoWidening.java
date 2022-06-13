package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

        byte sayi1= 44;
        System.out.println(sayi1);  // 44

        // esitligin solu short, sagi ise byte olmasina ragmen java itiraz etmiyor
        // deger olarak atanan data turu variable data turunden kucuk oldugu icin java sorun yapmaz
        // Auto Widening

        short sayi2=sayi1;
        System.out.println(sayi2);  // 44

        double sayi3=sayi2;
        System.out.println(sayi3);  // 44


    }
}
