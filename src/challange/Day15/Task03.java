package challange.Day15;

import java.time.LocalDateTime;

public class Task03 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("time = " + time);
        if(time.getSecond()<=10)
            System.out.println("ilk 10 saniye icerisinde");
        else System.out.println("ilk 10 saniye disinda");
    }
}
