package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now(); // objenin oluşturulduğu tarihi trh'ye atar
        LocalDate baskaTrh= LocalDate.of(2002,10,1);
        // idediğimiz yıl, ay, gün değerlerine göre bize obje oluşturur

        System.out.println(trh); // 2022-03-31
        // get'li method'larla terih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); // 31
        System.out.println(trh.getDayOfWeek()); // THURSDAY
        System.out.println(trh.getMonthValue()); // 3
        System.out.println(trh.getYear()); // 2022

        // bir tarihten istediğimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.plusWeeks(20)); // 2022-08-18
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022-02-21

        // İstediğimiz ülkenin o andaki tarihini elde etmek istersek
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01

        // is ile başlayan method'lar boolean sonuçlar döndürür
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(baskaTrh)); // true
    }
}
