package Projeler.P13_vatandasProject.vatandasproje01;

public class VatandasBilgileri {
    //1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
    private String isimSoyisim;
    private String adres;
    private String telefon;

    public VatandasBilgileri(){
    }

    public VatandasBilgileri(String isimSoyisim, String adres, String telefon){
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

    @Override
    public String toString() {
        return "Isim Soyisim = " + isimSoyisim +
                " Adres = " + adres +
                " Telefon = " + telefon;
    }
}
