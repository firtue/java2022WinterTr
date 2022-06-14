package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        // Java'da collection üyesi bir yapıda data türü Object seçilirse,
        // her data türünden değer ekleyebiliriz
        // ancak bu durumda sürekli casting problemleri ile karşılaşabiliriz

        List<Object> list = new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.2);

        System.out.println(list); // [Ergin, 15, 10.2]
        list.set(1,(Integer)(list.get(1))+10);


        Map<Integer,String> sinifList = new HashMap<>();
        // Bir sınıft öğrenci no ve isim, soyisim, branş olarak map oluşturmak istiyoruz
        // key tek bir unique değerdir
        // ama value/değer birden fazla bilginin birleşiminden oluşabilir
        // bu durumda daha sonra istediğimiz bilgilere doğru şekilde ulaşabilmek için
        // tüm elementler için value aynı biçimde oluşturulmalıdır
        // (veri sıralaması ve şekilsel açıdan(nokta, virgül, aralardaki boşluk))

        sinifList.put(101,"Ali, Can, Dev");
        sinifList.put(102,"Veli, Yan, Qa");
        sinifList.put(103,"Ali, Yan, C#");

        System.out.println(sinifList);
        // {101=Ali, Can, Dev, 102=Veli, Yan, Qa, 103=Ali, Yan, Dev}

        System.out.println(sinifList.keySet()); // [101, 102, 103]

        System.out.println(sinifList.values());
        // [Ali, Can, Dev, Veli, Yan, Qa, Ali, Yan, Dev]


    }
}
