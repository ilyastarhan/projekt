package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap02;

public class Kisi {
    private String adiSoyadi;
    private String kimlikNo;
    private int yas;

    public Kisi(String adiSoyadi, String kimlikNo, int yas) {
        this.adiSoyadi = adiSoyadi;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {

    }

    public String getAdiSoyadi() {

        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getKimlikNo() {
        if(kimlikNo.length()==11){
            this.kimlikNo = kimlikNo;
        }else{
            this.kimlikNo ="Hatali TC";
        }
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {

        this.kimlikNo = kimlikNo;

    }

    public int getYas() {

        return yas>6&&yas<55?this.yas:-1;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adiSoyadi='" + adiSoyadi + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
