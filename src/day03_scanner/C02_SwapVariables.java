package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {

        //1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        // Orn  : sayi1=10 ve sayi2=20;
        //  kod calistiktan sonra
        //  sayi1=20 ve sayi2=10

        int sayi1, sayi2;

        sayi1=10;
        sayi2=20;

        System.out.println("Swap'dan önce, sayi1: "+ sayi1 +", sayi2: "+ sayi2);

        int temp;
        // 1.adim bos bir variable olusturup
        //   sayi1'i ona atayalim
        temp=sayi1;
        // 2.adim sayi1'e yeni degerini atayalim
        sayi1= sayi2;
        // 3. adim sayi2'ye temp'e yedekledigimiz sayi1 degerini atayalim
        sayi2= temp;

        System.out.println("Swap'dan sonra, sayi1: "+ sayi1 +", sayi2: "+ sayi2);
    }
}
