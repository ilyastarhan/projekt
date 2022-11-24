package j36_Map;

public class Kartvizit {
    String isim;
    String eMail;
    String adres;
    String telefon;
    int id =100;


    public Kartvizit(String isim, String eMail, String adres, String telefon) {
        this.isim = isim;
        this.eMail = eMail;
        this.adres = adres;
        this.telefon = telefon;
        id++;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", eMail='" + eMail + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                ", id=" + id +
                '}';
    }
}
