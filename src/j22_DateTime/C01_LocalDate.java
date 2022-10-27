package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());
        System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());

        LocalDate date1 = LocalDate.of(1988,9,4);
        LocalDate date2 = LocalDate.of(1988, Month.SEPTEMBER,4);
        System.out.println("date1.getDayOfWeek() = " + date1.getDayOfWeek());
        System.out.println("date2.plusMonths(3) = " + date2.plusMonths(3));
        date2.minusWeeks(2);
        System.out.println("date2.plusDays(4).minusWeeks(5) = " + date2.plusDays(4).minusWeeks(5));
        System.out.println("date2.isLeapYear() = " + date2.isLeapYear());
        System.out.println("date2.isLeapYear() = " + date2.isLeapYear());

    }
}
