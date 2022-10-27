package j22_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C09_OCA01 {
    public static void main(String[] args) {

        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("date = " + date); // Exception hatasi date-time
    }
}
