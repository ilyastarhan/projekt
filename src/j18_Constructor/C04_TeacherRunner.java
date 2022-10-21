package j18_Constructor;

public class C04_TeacherRunner {


    public static void main(String[] args) {

        C04_Teacher ogrtmn1 = new C04_Teacher();
        ogrtmn1.ad = "Haluk";
        ogrtmn1.soyad = "Bilgin";
        ogrtmn1.brans = "Matematik";
        ogrtmn1.iD = 1234556;
        ogrtmn1.maas = 12000;
        ogrtmn1.emekliMi = false;
        ogrtmn1.tecrube = 15;
        ogrtmn1.dersSaati();
        System.out.println("ogrtmn1 = " + ogrtmn1);
        C04_Teacher ogrtmn2 = new C04_Teacher("Ilyas", "Tarhan", "cografya", 12000, 6, 12345,false);
        System.out.println("ogrtmn2 = " + ogrtmn2);
C04_Teacher ogrtmn4 = new C04_Teacher("Ahmet", "haktan", "matematik", 25000, 7, 102,false);
        System.out.println("ogrtmn4 = " + ogrtmn4);
    }
}
