package j25_Encapsulation;

public class Ogretmen {
    String brans = "Matematik";
    int dogumTarihi = 1980;
    private long kimlikNo = 2222211110l;

    public String getBrans() {
        return brans;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "brans='" + brans + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                ", kimlikNo=" + kimlikNo +
                '}';
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public int getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(int dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }



}
