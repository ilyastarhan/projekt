package j20_PassByValue;

public class C02_PassByValue {

    public static void main(String[] args) {
        //task-> verilen fiyat icin


        double fiyat = 100;
        System.out.println("onBirIndirim(fiyat) = " + onBirIndirim(fiyat));
        System.out.println("yirmiIkiIndirim(fiyat) = " + yirmiIkiIndirim(fiyat));
        System.out.println("otuzUcIndirim(fiyat) = " + otuzUcIndirim(fiyat));
        System.out.println("fiyat = " + fiyat);
        fiyat=otuzUcIndirim(fiyat);
        System.out.println(fiyat);

    }

    private static double otuzUcIndirim(double fiyat) {
        return fiyat*0.89;
    }
    private static double yirmiIkiIndirim(double fiyat) {
        return fiyat * 0.78;
    }
    private static double onBirIndirim(double fiyat) {
        return fiyat * 0.67;
    }
}
