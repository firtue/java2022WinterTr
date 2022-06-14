package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        // sınıftaki öğrenci listesini düzenli olarak yazdıralım

        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        /*
        Eğer key'lere tek tek ulaşmak istersek index yapısına ihtiyacımız var
        ancak map index yapısını desteklemez
        bunun için key'leri önce bir set'e, sonra da set'in tüm elementlerini bir List'e ekledik
        */
        Set<Integer> sinifKeySeti= sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySeti);
        System.out.println(keyList); // [101, 102, 103]

        // Şimdi de value'leri index ile ulaşabileceğimiz bir şekle sokalım

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl); // [Ali, Can, Dev, Veli, Yan, Qa, Ali, Yan, C#]


        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        System.out.println(sinifValueList);
        /*
         her bir value birden fazla bilgiyi içeriyor
         onun için value'leri multidimensional bir array' atmak mantıklı duruyor
         ancak multidimensional array oluşturmak için byutları bilmeye ihtiyaç var
        */

        int outerArrayBoyut= sinifValueList.size();
        System.out.println(outerArrayBoyut); // 3

        // inner array'lerin boyutunu bulamak biraz daha kompleks olacak

        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue); // Ali, Can, Dev

        String ilkValueArray[]=ilkValue.split(", "); // virgüllerden ayırıp array'e ekledik

        int innerArrayBoyut= ilkValueArray.length;
        System.out.println(innerArrayBoyut); // 3


        String valueMDArr[][]= new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[]= sinifValueList.get(i).split(", ");

            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j]=temp[j];
            }
        }
        System.out.println(Arrays.deepToString(valueMDArr));
        // [[Ali, Can, Dev], [Veli, Yan, Qa], [Ali, Yan, C#]]

        /*
         bu satıra kadar key'leri index ile ulaşabldiğimiz keyList'e atadık
         value'leri valueMDArr'e atadık
         şimdi bu key ve value'leri istediğim gibi manuple edebiliriz
         */

        System.out.println("Numara   İsim   Soyisim   Branş");
        System.out.println("======   ====   =======   =====");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+ "       ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDArr[i][j]+"      ");
            }

            System.out.println("");
        }

    }
}
