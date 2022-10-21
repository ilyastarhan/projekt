package j18_Constructor;

public class C04_Teacher {
    String ad;
    String soyad;
    String brans;
    double maas;
    int tecrube;
    int iD;
    boolean emekliMi = false;



    //parametreli constructor parametresis constructor u ezer


    public C04_Teacher() {
    }

    public C04_Teacher(String ad, String soyad, String brans, double maas, int tecrube, int iD, boolean emekliMi) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.maas = maas;
        this.tecrube = tecrube;
        this.iD = iD;
        this.emekliMi = emekliMi;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", maas=" + maas +
                ", tecrube=" + tecrube +
                ", iD=" + iD +
                ", emekliMi=" + emekliMi +
                '}';
    }



    public void dersSaati(){
        System.out.println("agam haftada 20 saatten sonrasi ekstraya girer");
    }

}
