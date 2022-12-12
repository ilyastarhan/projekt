package Projeler.aracKiralama;

public class Arac {
    private String marka, model, yakitTipi,vites;
    private int gunlukUcret;
    private int aracId;
    static private int id;

    static{

        id = 1000;
    }

    public Arac(String marka, String model, String yakitTipi, String vites, int gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
        this.aracId = id++;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public int getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public int getAracId() {
        return aracId;
    }

    public void setAracId(int aracId) {
        this.aracId = aracId;
    }

    @Override
    public String toString() {
        return aracId + "\t" + marka+ "\t"+ "\t" + "\t"+ model+ "\t" + "\t" +
               yakitTipi+ "\t"+ "\t" + vites+ "\t"+ "\t"+"\t"+ gunlukUcret;
    }

}
