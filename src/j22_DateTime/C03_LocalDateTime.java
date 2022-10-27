package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        //LocalDateTime -> tarih(yil-ay-gün) ve zaman (saat-dakika-saniye-milisaniye) bilgilerini tutar.

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        LocalDate date = LocalDate.of(2022,10,25);
        LocalTime time = LocalTime.of(14,25,23);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        System.out.println("dateTime = " + dateTime);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, Month.APRIL,15,22,43);
        System.out.println("dateTime2 = " + dateTime2);
        System.out.println("dateTime.getYear() = " + dateTime.getYear());
        System.out.println("dateTime.getMonthValue() = " + dateTime.getMonthValue());
        System.out.println("dateTime.getDayOfMonth() = " + dateTime.getDayOfMonth());

    }
}
