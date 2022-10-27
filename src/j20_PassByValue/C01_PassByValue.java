package j20_PassByValue;

public class C01_PassByValue {

    public static void main(String[] args) {
        /* Java passbyvalue bir programlama dilidir.
        bir primitive variable parametre olarak bir methoda cagrildiginda variable degil bir copy clone (vedikalik resim)
        (pointer) degeri gönderilir.

         */

        //task -> verilen fiyat icin %24 artirilmis fiyati print eden method yaziniz.

        double fiyat = 100;
        System.out.println("fiyat = " + fiyat);

        fiyatartis(fiyat);
        System.out.println("fiyat = " + fiyat);
    }
    public static void fiyatartis(double fiyat){
        fiyat *= 1.24;
        System.out.println("arttirilmis fiyat = " + fiyat);

    }
}
