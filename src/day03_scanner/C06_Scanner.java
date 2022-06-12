package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi yazınız");
        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminizi yazınız");
        String soyisim=scan.nextLine();

        System.out.println("İsim ve soyisim:  "+isim+" "+soyisim);



    }
}
