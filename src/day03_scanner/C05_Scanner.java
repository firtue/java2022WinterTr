package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen çemberin yaricapini giriniz");
        float yaricap= scan.nextFloat();

        System.out.println("Girdiğiniz yarıçao: "+yaricap);
        System.out.println("Çemberin çevresi: "+2*3.14*yaricap);
        System.out.println("Dairenin alanı: "+3.14* yaricap*yaricap);
    }
}
