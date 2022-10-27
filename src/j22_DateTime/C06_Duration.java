package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {
        LocalTime gece = LocalTime.of(14,20);
        LocalTime oglen = LocalTime.of(13,30);
        Duration fark = Duration.between(gece,oglen);
        Duration fark1 = Duration.between(oglen,gece);
        System.out.println("fark = " + fark);
        System.out.println("fark.toHours() = " + fark.toMinutes());
        System.out.println("fark1 = " + fark1);
        System.out.println("fark1.toHours() = " + fark1.toMinutes());
        System.out.println("fark.getSecond() = " + fark.getSeconds());
    }
}
