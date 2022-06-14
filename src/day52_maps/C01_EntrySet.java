package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap = MapOlustur.myMap();

        /*
        myMap..entrySet(); methodu bize Enrty'lerden oluşan bir set döndürür
        Eğer bu Entry'leri manipule etmek istiyorsak,
        methodun döndürdüğü Set'i eni bir Set oluşturup store etmeliyiz
         */

        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMap.entrySet();

        System.out.println("no   isim  soyisim   baranş");
        System.out.println("___________________________");

        for (Map.Entry<Integer,String> each : sinifEntrySet
             ) {

            Integer entryKey = each.getKey();
            String valueStr = each.getValue();

            String valueArr[] = valueStr.split(", ");

            System.out.printf("%-4d %s %7s %8s\n", entryKey, valueArr[0], valueArr[1], valueArr[2]);

        }
        System.out.println("___________________________");
    }
}

