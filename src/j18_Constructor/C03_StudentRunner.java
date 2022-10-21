package j18_Constructor;

public class C03_StudentRunner {


    public static void main(String[] args) {
        C03_Student ogrnc1 = new C03_Student();
        ogrnc1.ad = "ilyas";
        ogrnc1.soyad = "tarhan";
        ogrnc1.okulNo = 2159;
        ogrnc1.sinif = 2;
        ogrnc1.takdir = false;
        ogrnc1.ortalama = 70;
        System.out.println("ogrnc1 = " + ogrnc1);
        ogrnc1.mezuniyet();

    }
}
