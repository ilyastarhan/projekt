package j18_Constructor;

public class C07_Teacher {

    String isim;
    int tecrube, kidem =5;

    public C07_Teacher(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;

    }
    public void kidemHesapla(int kidem) {
        System.out.println("agam kidemin : " +(kidem * 2));
        System.out.println("agam kidemin : " +(this.kidem * 2));

    }

}
