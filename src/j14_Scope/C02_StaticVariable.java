package j14_Scope;

public class C02_StaticVariable {



    /* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
        ogrenci notlari veya ogretmen branslari gibi
        bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

       Static variabler ise class variable olarak tanimlanir
       ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
       eger static variable'in degeri degistirilirse herkes icin degisir


     */

    static String firmaName="clarusway";
    static int firmaID;
    static boolean firmaIT;
    public static void main(String[] args) {
        firmaID = 1001;
        System.out.println("firmaID = " + firmaID);
        C02_StaticVariable.firmaID = 2002;
        System.out.println("firmaID = " + firmaID);
        staticMethod();
       // method();//

    }
    public static void staticMethod(){
    firmaID = 3003;
        System.out.println("firmaID = " + firmaID);
    }
    public void method(){
        firmaName = "ahmet";
        System.out.println("firmaName = " + firmaName);


    }
}
