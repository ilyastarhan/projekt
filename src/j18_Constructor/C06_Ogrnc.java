package j18_Constructor;

public class C06_Ogrnc {
    String name = "Merve hanim";
    String isim;
    int age, yas;


    public C06_Ogrnc(String ad, int age) {
        //    this.name = name;
        //    this.age = age;

        isim = ad;
        yas = age;
        System.out.println("constructor daki isim :" + ad);
        System.out.println("constructor daki isim :" + name);
        System.out.println("constructor daki isim :" + isim);
    }
}
