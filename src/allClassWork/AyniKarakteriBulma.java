package allClassWork;

import java.util.Scanner;

public class AyniKarakteriBulma {
    public static void main(String[] args) {
        // Bir metindeki unique karakterleri bulan bir kod yaziniz. Hello ==> Heo

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz: ");
        String str = scan.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){

                System.out.print(str.charAt(i));

            }

        }



    }
}
