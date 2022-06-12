package allClassWork;

public class Swap {
    public static void main(String[] args) {

        //Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz

        //Orn : sayi1=10 ve sayi2=20;
        //      kod calistiktan sonra
        //      sayi1=20 ve sayi2=10

        int sayi1=10, sayi2=20;
        int temp;

        System.out.println("önce sayi1= "+ sayi1+", sayi2= "+ sayi2);

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("sonra sayi1= "+ sayi1+", sayi2= "+ sayi2);

    }
}
