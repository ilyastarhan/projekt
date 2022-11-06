package alistirmalar.abstractKonusu;

public abstract class  Akademisyen extends Calisan {

    String bolum, gorevler;
    String ders;
    public Akademisyen(String adSoyad, String ePosta, String telefon, String bolum, String gorevler, String ders){
        super(adSoyad, ePosta, bolum);
        this.bolum= bolum;
        this.ders = ders;
        this.gorevler = gorevler;

    }
    public void derseGir(){
        System.out.println("Derse girildi");
    }
  //  public String giris(){
  //      return super.giris() + "A Kapisindan !";
  //  }
    public String getBolum(){
        return bolum;
    }
    public void setBolum(String bolum){
        this.bolum = bolum;
    }
    public String getGorevler(){
        return gorevler;
    }
    public void setGorevler(String gorevler){
        this.gorevler = gorevler;
    }
    public String getDers(){
        return ders;
    }
    public void setDers(String ders){
        this.ders = ders;
    }

}
