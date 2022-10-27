package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /* eger bir methodda yapilan degiisklik kalici olsun isteniyorsa
        1.degisiklik yapilan variablera atama yapilir.

         */
        double etiketFiyati=100;
        double indirimOrani=0.10;
        etiketFiyati = indirim(etiketFiyati, indirimOrani);
        System.out.println("etiketFiyati = " + etiketFiyati);


    }
    public static double indirim(double fiyat, double oran){
        fiyat *= (1-oran);
        System.out.println("indirimli fiyat = " + fiyat);
        return fiyat;

    }
}
