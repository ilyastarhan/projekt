package Projeler.aracKiralama;


import java.util.TreeMap;

public class AracListesi {

    static TreeMap<Integer,Arac> aracListesi = new TreeMap<>();

    public static void arabalar(){
        Arac opelDizelOtomatik = new Arac("Opel", "Astra", "dizel", "otomatik", 150);
        Arac opelDizelManuel = new Arac("Opel", "Corsa", "dizel", "manuel", 130);
        Arac opelBenzinliOtomatik = new Arac("Opel", "Kangoo", "benzin", "otomatik", 150);
        Arac opelBenzinliManuel = new Arac("Opel", "Insignia", "benzin", "manuel", 130);
        Arac toyotaDizelOtomatik = new Arac("Toyota", "Corolla", "dizel", "otomatik", 180);
        Arac toyotaDizelManuel = new Arac("Toyota", "Auris", "dizel", "manuel", 160);
        Arac toyotaBenzinliOtomatik = new Arac("Toyota", "Yaris", "benzin", "otomatik", 200);
        Arac toyotaBenzinliManuel = new Arac("Toyota", "Verso", "benzin", "manuel", 190);
        Arac vwDizelOtomatik = new Arac("VolksWagen", "Golf", "dizel", "otomatik", 180);
        Arac vwDizelManuel = new Arac("VolksWagen", "Passat", "dizel", "manuel", 160);
        Arac vwBenzinliOtomatik = new Arac("VolksWagen", "Polo", "benzin", "otomatik", 200);
        Arac vwBenzinliManuel = new Arac("VolksWagen", "Caddy", "benzin", "manuel", 190);

        aracListesi.put(opelDizelOtomatik.getAracId(),opelDizelOtomatik);
        aracListesi.put(opelDizelManuel.getAracId(),opelDizelManuel);
        aracListesi.put(opelBenzinliOtomatik.getAracId(),opelBenzinliOtomatik);
        aracListesi.put(opelBenzinliManuel.getAracId(),opelBenzinliManuel);
        aracListesi.put(toyotaDizelOtomatik.getAracId(),toyotaDizelOtomatik);
        aracListesi.put(toyotaDizelManuel.getAracId(),toyotaDizelManuel);
        aracListesi.put(toyotaBenzinliOtomatik.getAracId(),toyotaBenzinliOtomatik);
        aracListesi.put(toyotaBenzinliManuel.getAracId(),toyotaBenzinliManuel);
        aracListesi.put(vwDizelOtomatik.getAracId(),vwDizelOtomatik);
        aracListesi.put(vwDizelManuel.getAracId(),vwDizelManuel);
        aracListesi.put(vwBenzinliOtomatik.getAracId(),vwBenzinliOtomatik);
        aracListesi.put(vwBenzinliManuel.getAracId(),vwBenzinliManuel);
    }
}
