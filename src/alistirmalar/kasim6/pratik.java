package alistirmalar.kasim6;

public class pratik {
    public static void main(String[] args) {
        /*
            6)Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalı-
ğa yuvarla"
b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"
Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
125 yukarı yuvarlanacak ve değer 130 olacaktır. 123 aşağı yuvarlanacak ve değer 120 olacaktır.
        */


        /*

    2) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.*/
        /*
altındaki asal sayıların toplamı 2 + 3 + 5 + 7 = 17'dir.
İki milyonun altındaki tüm asal sayıların toplamını bulun.
*/
        int toplam = 0;

        for(int i=2; i< 2000000; i++){
            int count = 0;
            for(int j = 2; j< i; j++){
                if(i%j==0)
                    count++;
                }
            if(count<1){
                toplam+=i;
            }
        }
        System.out.println("toplam = " + toplam);



        /*

 4)Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de doğmuştur.
  Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark nedir?
  */
  //      ZonedDateTime ali = ZonedDateTime.of(2015,2,5,10,00,00,00,America/Los_Angeles);
   /*
  5)Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
   Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.

         */

    }
}
