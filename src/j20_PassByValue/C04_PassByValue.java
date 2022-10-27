package j20_PassByValue;

public class C04_PassByValue {
    static double etiketFiyati;
    static double indirimOrani;

    public static void main(String[] args) {

        /* eger bir methodda yapilan degiisklik kalici olsun isteniyorsa
        1.degisiklik yapilan variabler static olarak tanimlanir.
         */
        etiketFiyati = 100;
        indirimOrani = 0.10;
        indir();
        indirimOrani = 0.10;
        indir();
        indirimOrani = 0.10;
       indir();
        System.out.println("etiketFiyati = " + etiketFiyati);
    }

    public static void indir() {
        etiketFiyati *= (1 - indirimOrani);
        System.out.println("etiketFiyati = " + etiketFiyati);
    }
}
