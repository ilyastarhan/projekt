package alistirmalar.abstractKonusu;

public class Calisan {
    String adSoyad;
    String ePosta;
    String telefon;

   public Calisan(String adSoyad, String ePosta, String telefon){
        this.adSoyad = adSoyad;
        this.ePosta = ePosta;
        this.telefon = telefon;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


}
