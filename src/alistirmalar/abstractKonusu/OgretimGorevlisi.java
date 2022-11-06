package alistirmalar.abstractKonusu;

public class OgretimGorevlisi extends Akademisyen {
    String unvan;


    public OgretimGorevlisi(String adSoyad, String ePosta, String telefon, String bolum, String gorevler, String ders, String unvan) {
        super(adSoyad, ePosta, telefon, bolum, gorevler, ders);
        this.unvan = unvan;
    }

 //  public String giris() {
 //      return this.unvan + " " + super.giris();
 //  }

    public void derseGir(int dersSaati) {
        System.out.println(getUnvan() + " " + getAdSoyad() + " " + getDers() + " dersine girdi");
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}