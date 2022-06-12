package allClassWork;

import java.util.Scanner;

public class IsimSoyisim {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lütfen isminizi giriniz");
        String soyisim= scan.next();

        System.out.println("İsminiz= "+isim);
        System.out.println("Soyisminiz= "+soyisim);
        System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
    }
}
