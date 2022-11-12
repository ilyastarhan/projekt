package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap02;

public class Ogretmen extends Kisi {
    private String bolum;
    private int sicilNo;


    public Ogretmen() {
    }


    public Ogretmen(String adiSoyadi, String kimlikNo, int yas, String bolum, int sicilNo) {
        super(adiSoyadi, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }


    public String getBolum() {
        return bolum;
    }


    public void setBolum(String bolum) {
        this.bolum = bolum;
    }


    public int getSicilNo() {
        return sicilNo;
    }


    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }


    @Override
    public String toString() {
        return "Ogretmen{" +
                "adiSoyadi='" + getAdiSoyadi() + '\'' +
                ", kimlikNo='" + getKimlikNo() + '\'' +
                ", yas=" + getYas() +
                ", bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';
    }
}
