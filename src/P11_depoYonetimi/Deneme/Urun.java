package P11_depoYonetimi.Deneme;

public class Urun {
    private int urunId = 1000;
    private String urunIsmi;
    private  String ureticiIsmi;
    private String urunBirimi;

    private String urunRaf;

    public Urun(String urunIsmi, String ureticiIsmi, String urunBirimi) {
        this.urunIsmi = urunIsmi;
        this.ureticiIsmi = ureticiIsmi;
        this.urunBirimi = urunBirimi;
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
}
