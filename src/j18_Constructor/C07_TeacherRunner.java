package j18_Constructor;

public class C07_TeacherRunner {
    public static void main(String[] args) {

        C07_Teacher hcm = new C07_Teacher("sevdenur ögretmenim", 11);
        System.out.println("hcm.isim = " + hcm.isim);
        System.out.println("hcm.kidem = " + hcm.kidem);
        hcm.kidemHesapla(13);

    }



}
