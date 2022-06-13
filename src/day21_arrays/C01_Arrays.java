package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        // array'i nasıl deklare ederiz
        // data türü, array'ın ismi ve köşeli parantez yazarak array deklare edilir

        int arr1[]= {1,3,5};
        int[] arr2= {1,3,5};
        int [] arr3={1,3,5};

        double arr4[]= {10.2,20.1,5};

        String arr5[]={"Ali", "Veli", "Ayşe"};

        // assign mecburi mi?
        int sayi;
        int arr6[];
        // kullanmadan önce mutlaka değer atanması yapmamız gerekir

        // Hem deklare edip hem de atama yapacaksam nasıl yapabilirim?
        // 1- deklare edip eşitliğinsağına süslü parantez içerisinde değerleri yazabilirim
        String arr7[]={"Ali", "Veli", "49", "50"};

        // 2- içine değer atamadan oluşturmak isterseniz, boyutunu belirlememiz gerekir
        int arr8[]= new int[5]; // java içinde 5 tane default değer olan bir array oluşturur
                                // [0,0,0,0,0]


    }
}
