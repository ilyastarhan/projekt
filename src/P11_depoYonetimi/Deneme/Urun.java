package P11_depoYonetimi.Deneme;

public class Urun {
    static int idCount = 1000;
    private int urunId;
    private String urunIsmi;
    private  String ureticiIsmi;
    private String urunBirimi;
    private int urunRaf;
    private int urunMiktari;

    public Urun(String urunIsmi, String ureticiIsmi, String urunBirimi) {
        this.urunIsmi = urunIsmi;
        this.ureticiIsmi = ureticiIsmi;
        this.urunBirimi = urunBirimi;
        urunId=idCount++;
    }

    public int getUrunRaf() {
        return urunRaf;
    }

    public void setUrunRaf(int urunRaf) {
        this.urunRaf = urunRaf;
    }

    public int getUrunMiktari() {
        return urunMiktari;
    }

    public void setUrunMiktari(int urunMiktari) {
        this.urunMiktari = urunMiktari;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {

        this.urunId = urunId;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUreticiIsmi() {
        return ureticiIsmi;
    }

    public void setUreticiIsmi(String ureticiIsmi) {
        this.ureticiIsmi = ureticiIsmi;
    }
    public String getUrunBirimi() {
        return urunBirimi;
    }

    public void setUrunBirimi(String urunBirimi) {
        this.urunBirimi = urunBirimi;
    }


    public String toString() {

        return urunId + "\t" + urunIsmi + "\t" + "\t"+ "\t"  + ureticiIsmi + "\t" + "\t" + "\t" + urunBirimi + "\t" + "\t" + urunMiktari + "\t" + "\t" + "\t" + urunRaf;

    }
}
