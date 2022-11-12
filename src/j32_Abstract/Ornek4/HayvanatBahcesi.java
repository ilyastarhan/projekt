package j32_Abstract.Ornek4;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        //kedi.setId();
        kedi.setIsim("Köpük");
        kedi.setVahsi(false);
        kedi.setDogumTarih(LocalDate.of(2018, 1, 5));
        System.out.println(kedi);
//        kedi.yiyecegi();
//        kedi.yemekMiktari();
//        kedi.gunlukUykuSuresi();
//        kedi.sesi();

        Kartal kartal = new Kartal();
        //kartal.setId();
        kartal.setIsim("Gezgin");
        kartal.setVahsi(true);
        kartal.setDogumTarih(LocalDate.of(2018, 1, 5));
        System.out.println(kartal);
//        kartal.yiyecegi();
//        kartal.gunlukUykuSuresi();
//        kartal.yemekMiktari();
//        kartal.sesi();

        System.out.println(Hayvan.sayac);

    }
}
