package j26_Inheritance.Inheritance02;

public class Runner {


    public static void main(String[] args) {
        Kedi kd1 = new Kedi();
        System.out.println("kd1.a = " + kd1.a);
        System.out.println("kd1.a = " + kd1.c);
        System.out.println("kd1.a = " + kd1.d);
        System.out.println("kd1.a = " + kd1.m);

/*
        Method cagirilirken ayni isimli methodlardan
        hangisinin kullanilacagina Constructor karar verir.
                Methodlari arastirmaya Consctuctor ismini tasiyan
        class'dan baslayin ve parentlarda arastirmaya devam edin.
                */
        /*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/

        Mammal k2 = new Kedi("a");
        System.out.println();
        Mammal k3 = new Kedi();
        System.out.println();
        Hayvancik k4 = new Kedi();
        System.out.println();
        Mammal m1 = new Mammal();

        //hayvancik parametreli cons
        // mammal char parametreli cons
        //mammal parametresiz cons
        // kedi oparametresiz cons
        // 4
        //kedi parametreli cons

        // hayvancik parametreli cons
        // mammal char paramterreli cons
        //mammal parametresiz cons
        //kedi parametresiz cons
        Hayvancik k5 = new Kedi();
        System.out.println("k5.m = " + k5.m);
        System.out.println("k5.a = " + k5.a);
        /// k5.c datatype class oldugu icin classta olmayan eleman cagrilamaz
        k5.mA();
        k5.mM();
        Mammal m2 = new Mammal('$');
        System.out.println("m2.m = " + m2.m);
        System.out.println("m2.a = " + m2.a);
        System.out.println("m2.c = " + m2.c);
        //child klasstan datatapye ayni olmadigi icin cagrilmaz
    }
}
