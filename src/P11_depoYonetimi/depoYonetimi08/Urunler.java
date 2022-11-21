package P11_depoYonetimi.depoYonetimi08;

import java.util.HashMap;
import java.util.Map;

public class Urunler {

  //Daha sonra methodları üzerine bina edeceğimiz map ve const. oluşturuldu. Getter ve Setter create edildi.
  //İhtiyaç duyulabilir diye to string metodu hazır edildi.


  static Map<Integer,Urunler> urunListesiMap = new HashMap<>();


    private String isim = "";
    private String uretici = "";
    private int miktar = 0;
    private String birim = "";
    private String raf = "";
    private double maliyet=0.0;
    private double fiyat=0.0;

  public void setMaliyet(double maliyet) {
    this.maliyet = maliyet;
  }

  public void setFiyat(double fiyat) {
    this.fiyat = fiyat;
  }

  public double getMaliyet() {
    return maliyet;
  }

  public double getFiyat() {
    return fiyat;
  }

  public Urunler() {
  }

  public Urunler(String isim, String uretici, int miktar, String birim, String raf, double maliyet, double fiyat) {
    this.isim = isim;
    this.uretici = uretici;
    this.miktar = miktar;
    this.birim = birim;
    this.raf = raf;
    this.maliyet = maliyet;
    this.fiyat = fiyat;
  }




  public String getIsim() {
    return isim;
  }

  public void setIsim(String isim) {
    this.isim = isim;
  }

  public String getUretici() {
    return uretici;
  }

  public void setUretici(String uretici) {
    this.uretici = uretici;
  }

  public int getMiktar() {
    return miktar;
  }

  public void setMiktar(int miktar) {
    this.miktar = miktar;
  }

  public String getBirim() {
    return birim;
  }

  public void setBirim(String birim) {
    this.birim = birim;
  }

  public String getRaf() {
    return raf;
  }

  public void setRaf(String raf) {
    this.raf = raf;
  }


  @Override
  public String toString() {
    return "Urunler{" +
            "isim='" + isim + '\'' +
            ", uretici='" + uretici + '\'' +
            ", miktar=" + miktar +
            ", birim='" + birim + '\'' +
            ", raf='" + raf + '\'' +
            '}';
  }
}
