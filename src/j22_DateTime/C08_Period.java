package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //Period -> iki tarih arasinda gecen tekrarlanabilen zamani tutar.
        LocalDate bugun = LocalDate.now();
        LocalDate ilyas = LocalDate.of(1988,9,04);
        Period fark  = Period.between(ilyas, bugun);
        System.out.println("fark = " + fark);
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());
        System.out.println("fark.getDays() = " + fark.getDays());
        System.out.println();
        System.out.println("bugun = " + bugun);
        Period period5Gun = Period.ofDays(5);
        Period period7Ay = Period.ofMonths(7);
        Period periodX = Period.ofMonths(7).ofDays(4);
        //period olusturmada coklu tanimlamada son girilen parametre calisir

        System.out.println("bugun.plus(period5Gun) = " + bugun.plus(period5Gun));
        System.out.println("bugun.plus(period7Ay) = " + bugun.plus(period7Ay));
        System.out.println("bugun.plus(periodX) = " + bugun.plus(periodX));
        LocalDate kursBaslangic = LocalDate.of(2022,9,05);
        System.out.println("kursBaslangic.plus(period.ofMonths(9)) = " + kursBaslangic.plus(Period.ofMonths(9)));
        System.out.println("kursBaslangic.plus(Period.ofMonths(9)).format(DateTimeFormatter.ISO_DATE) = " + kursBaslangic.plus(Period.ofMonths(9)).format(DateTimeFormatter.ISO_LOCAL_DATE));


    }
}
