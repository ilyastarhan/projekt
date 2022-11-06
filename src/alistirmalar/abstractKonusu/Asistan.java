package alistirmalar.abstractKonusu;

public class Asistan extends Akademisyen {
    protected String yuksekLisans;
    public Asistan(String adSoyad, String ePosta, String telefon, String bolum, String gorevler, String ders){
    super(adSoyad, ePosta, telefon, bolum, gorevler, ders);
    this.yuksekLisans = yuksekLisans;
    }
  //  public String giris(){
  //      return "Asistan "+ super.giris();
  //  }
    public String getYuksekLisans(){
        return yuksekLisans;
    }
    public void setYuksekLisans(String yuksekLisans){
        this.yuksekLisans = yuksekLisans;
    }
    public void derseGir(int dersSaati){
        System.out.println(getAdSoyad() + " " + getDers() + " dersine girdi");
    }
}
