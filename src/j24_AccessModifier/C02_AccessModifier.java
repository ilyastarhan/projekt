package j24_AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {

        C01_AccessModifier obj1 = new C01_AccessModifier(23,45);
        //default constructor private oldugu icin baska bir class tan erisim yapilamaz.
     //   C01_AccessModifier obj2 = new C01_AccessModifier(); default constriúcor private oldugu icin obje üretemez
        C02_AccessModifier obj3 = new C02_AccessModifier();
        System.out.println("obj1.defaultYas = " + obj1.defaultYas);
        System.out.println("obj1.protectedYas = " + obj1.protectedYas);
        System.out.println("obj1.publicYas = " + obj1.publicYas);
        obj1.protectedMethod();
       // obj1.privateMethod(); private method call edilemez

    }
}
