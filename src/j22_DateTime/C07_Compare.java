package j22_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C07_Compare {
    public static void main(String[] args) {
        /*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */
        LocalDate date = LocalDate.now();
        LocalDate date1 = date.minusDays(2);
        LocalDate date2 = date.plusDays(4);
        LocalDate date3 = LocalDate.of(1988,9,04);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date1.format(formatter) = " + date1.format(formatter));
        System.out.println("date2.format(formatter) = " + date2.format(formatter));
        System.out.println("date.format(formatter) = " + date.format(formatter));
        System.out.println("date1.isAfter(date2) = " + date1.isAfter(date2));
        System.out.println("date2.isBefore(date1) = " + date2.isBefore(date1));
        System.out.println("date1.isLeapYear() = " + date1.isLeapYear());
        System.out.println("date.isEqual(date1) = " + date.isEqual(date1));
        System.out.println("date.compareTo(date2) = " + date.compareTo(date2));
        System.out.println("date.compareTo(date1) = " + date.compareTo(date1));
        System.out.println("date.compareTo(date3) = " + date.compareTo(date3));

    }
}
