package allClassWork;

import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen pozitif bir tamsayı giriniz : ");
        int sayi= scan.nextInt();


        if (sayi<=0){
            System.out.println("Lütfen pozitif bir tamsayı giriniz");
        } else {

            if (sayi % 2 == 0) {
                System.out.println("Girdiğiniz sayı çift sayıdır");
            } else {
                System.out.println("Girdiğiniz sayı tek sayıdır");
            }

        }


    }
}
