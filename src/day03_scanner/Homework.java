package day03_scanner;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen iki adet tam sayı yazın,");
        int ilksayi=scan.nextInt();
        int ikincisayi=scan.nextInt();

        System.out.println("Toplmalerı= "+ (ilksayi+ikincisayi));
        System.out.println("Farkları= "+(ilksayi-ikincisayi));
        System.out.println("Çarpımları= "+(ilksayi*ikincisayi));
    }
}
