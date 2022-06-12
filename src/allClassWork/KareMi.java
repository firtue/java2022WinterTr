package allClassWork;

import java.util.Scanner;

public class KareMi {
    public static void main(String[] args) {
        //Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenarlarının uzunluğunu giriniz; ");

       int a,b;

        System.out.print("a kenarı, ");
        a=scan.nextInt();
        System.out.print("b kenarı, ");
        b=scan.nextInt();

        if (a==b){
            System.out.println("Girdiğiniz dikdörtgen karedir");
        } else {
            System.out.println("Girdiğiniz dikdörtgen kare değildir");
        }

    }
}
