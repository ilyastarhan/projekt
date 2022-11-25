package Projeler.P13_vatandasProject.vatandasproje02;

public class VatandasBilgileri {

    /* 1)Kullanicidan bir kimlik numarasi(4 haneli), isim, adres ve telefon alin. */

    private int kNo;
    private String isimSoyisim;
    private String adres;
    private String telefon;

    public VatandasBilgileri() {
    }

    public VatandasBilgileri(Integer kNo, String isimSoyisim, String adres, String telefon){
        this.isimSoyisim = isimSoyisim;
        this.adres = adres;
        this.telefon = telefon;
    }


    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
