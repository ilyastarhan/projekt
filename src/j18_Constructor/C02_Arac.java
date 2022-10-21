package j18_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km;
    double motorHacim;
    boolean vitesAutomatic = false;
    boolean ikinciEl;
    int yil;




    public static void main(String[] args) {
        C02_Arac arac1 = new C02_Arac();

        arac1.ikinciEl=true;
        arac1.marka="Volkswagen";
        arac1.km = 25000;
        arac1.motorHacim = 1.6;
        arac1.vitesAutomatic = true;
        arac1.model = "Jetta";
        arac1.yil = 2014;
        System.out.println(arac1.marka + " " + arac1.motorHacim + " "  +
                arac1.km + " "  + arac1.yil + " "  + arac1.vitesAutomatic + " "  + arac1.ikinciEl);
        C02_Arac arac2 = new C02_Arac();
        arac2.ikinciEl = true;
        arac2.yil = 2012;
        arac2.vitesAutomatic = false;
        arac2.marka = "Mercedes";
        arac2.model = "Vito";
        arac2.motorHacim = 2.4;
        arac2.km = 160000;
        System.out.println(arac2.marka + " " + arac2.model + " " + arac2.ikinciEl + " " +
                arac2.motorHacim + " " + arac2.km + " " + arac2.yil + " " + arac2.ikinciEl);
        C02_Arac arac3 = new C02_Arac();
        System.out.println("arac2 = " + arac2);


    }
}
