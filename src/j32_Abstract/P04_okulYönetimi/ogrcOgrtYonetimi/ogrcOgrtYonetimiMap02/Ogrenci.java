package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap02;

public class Ogrenci extends Kisi {
    private int numara;
    private String sinif;


    public Ogrenci() {
        super();

    }


    public Ogrenci(String adiSoyadi, String kimlikNo, int yas, int numara, String sinif) {
        super(adiSoyadi, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }


    public int getNumara() {
        return numara;
    }


    public void setNumara(int numara) {
        this.numara = numara;
    }


    public String getSinif() {
        return sinif;
    }


    public void setSinif(String sinif) {
        this.sinif = sinif;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "adiSoyadi='" + getAdiSoyadi() + '\'' +
                ", kimlikNo='" + getKimlikNo() + '\'' +
                ", yas=" + getYas() +
                ", numara=" + numara +
                ", sınıf='" + sinif + '\'' +
                '}';
    }
}