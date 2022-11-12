package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap01;

import java.util.HashMap;
import java.util.Map;

public class Ogretmen extends Kisi{

    static Map<String,Ogretmen> ogretmenListesiMap = new HashMap<>();

    private String bolum ="";
    private String sicil ="";

    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String yas, String bolum, String sicil) {
        super(adSoyad, yas);
        this.bolum = bolum;
        this.sicil = sicil;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicil='" + sicil + '\'' +
                "} " + super.toString();
    }
}
