package j18_Constructor;

public class C03_Student {
    //main olmayan sadece student obj create etmek icin pojo->plan old. java object : obj iicn
    //fields
    String ad;
    String soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;

    @Override
    public String toString() {//objenin referans degeri print etmemesi icin obj datata
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir +
                '}';
    }

    public void mezuniyet(){

        if(ortalama >= 50){
            System.out.println("agam diploman hayirli olsun");
        }
        else System.out.println("agama seneye de bekleriz, dewamkee");

    }



}
