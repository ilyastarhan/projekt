package challange.Day15;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Task02 {
    public static void main(String[] args) {

        ZonedDateTime asiaTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("asiaTokyo = " + asiaTokyo);
        System.out.println("asiaTokyo.format(DateTimeFormatter.ofPattern(\"yyyy-MM-dd\")) = " + asiaTokyo.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("asiaTokyo.format(format) = " + asiaTokyo.format(format));
    }


}
