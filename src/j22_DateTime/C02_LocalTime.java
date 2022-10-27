package j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        //LocalTime -> saat-dakika-saniye tutar.
        LocalTime localTime = LocalTime.now();
        System.out.println("localtime = " + localTime);
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());
        LocalTime localTime1 = LocalTime.of(21,47,13);
        System.out.println("localTime1.plusMinutes(90) = " + localTime1.plusMinutes(90));
        System.out.println("localTime.plusMinutes(45) = " + localTime.plusMinutes(45));
        LocalTime localTime2 = LocalTime.now();
        System.out.println("localTime for basi= " + localTime2.getNano());
        int sayi = 0;
        for(int i = 0; i <100000; i++) {
            sayi+=i;
        }
        LocalTime localTime3 = LocalTime.now();
        System.out.println("localTime for sonu= " + localTime3.getNano());
        System.out.println(localTime3.getNano() - localTime2.getNano());
    }
}
