package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        char ilkHarf= scan.next().charAt(0);
        // charAt(index) methodu parametre olarak yazdığımızda index'deki char ı bize getirir
        // String'de inde 0'dan başlar

        System.out.println("Girdiğiniz ismini ilk harfi: "+ilkHarf);
    }



}
