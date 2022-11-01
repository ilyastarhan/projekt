package challange.Day15;

import java.time.LocalDate;

public class Task01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        System.out.println("date.plusDays(1).plusMonths(1).plusYears(1) = " + date.plusDays(1).plusMonths(1).plusYears(1));
        System.out.println("date.minusDays(3).minusMonths(2).minusYears(5) = " + date.minusDays(3).minusMonths(2).minusYears(5));
    }
}
