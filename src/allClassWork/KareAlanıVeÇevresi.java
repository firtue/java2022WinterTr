package allClassWork;

import java.util.Scanner;

public class KareAlanıVeÇevresi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Karenin bir kenarının uzunluğunu giriniz");

        int kenarUzunluğu= scan.nextInt();

        int alan=kenarUzunluğu*kenarUzunluğu;

        System.out.println("Girdiğiniz karenin kenar uzunluğu= "+kenarUzunluğu*4);
        System.out.println("Girdiğiniz karenin alanı= "+alan);
        System.out.println("Girdiğiniz karenin içerisinde ki kenarlara teğet yuvarlağı çıkarttığımızda kalan alan= " + (alan-alan/4*3) );
    }
}
