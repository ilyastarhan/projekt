package j19_StaticVariable;

public class C02_StaticBlock {
    static String name;
    static{
        System.out.println("agam birinci static block calisti.");
        name="dilek hanim";
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        /*
        1. static blok yapilari static variable lari deger atamasi ya da update etmesi icin kullanilir
        2. static blok class olusturuldugunda bütün methedlardan (main method dahil) önce calisir
        3. birden fazla static block varsa yukaridan asagiya siralama ile calisir.

         */
        System.out.println("main method basladi");
        name = "ugur bey";
        System.out.println("name = " + name);
        System.out.println("main method bitti");

    }
    static {
        System.out.println("2 block calisti");
        name = "kerim bey";
        System.out.println("name = " + name);
    }
}
