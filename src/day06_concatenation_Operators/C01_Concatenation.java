package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        // variable'larin degerlerini degistirmeden asagidaki ifadeleri, bu variable'lari kullanarak yazdirin

        // Java5Guzel
        System.out.println(str1+sayi1+str2); // Java5Guzel

        // 2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2); // 2Guzel15

        // Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2)); // Java22

        // 53Guzel

        System.out.println(sayi1+sayi2+str2); //8Guzel
        System.out.println(sayi1+ (sayi2+  str2)); // 53Guzel
        System.out.println(""+sayi1+sayi2+str2); // 53Guzel

        /*
        Eğer tamamen sayılardan oluşan bir String varsa ve biz bunu int'a çevirmek istersek
        Integer.valueOf(str)

        bir sayıyı String'e çevirmek istersek
        ""+sayi
         */


    }
}
