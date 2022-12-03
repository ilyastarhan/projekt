package Homework.eylul19;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hizinizi giriniz: ");

        int currentSpeed = scan.nextInt();
        System.out.println("Ehliyetiniz var ise \"true\" yok ise \"false\" yaziniz: ");

        boolean isDriverLicenceAvailable = scan.nextBoolean();


//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

    //   if (isDriverLicenceAvailable) {
    //       if (currentSpeed < 55) {
    //           System.out.println("Kuralllara uydugunuz icin tesekkurler...");
    //       } else if (currentSpeed < 75) {
    //           System.out.println("Cezaniz 100$");
    //       } else if (currentSpeed < 85) {
    //           System.out.println("Cezaniz 150$");
    //       } else if (currentSpeed < 95) {
    //           System.out.println("Cezaniz 320$");
    //       } else {
    //           System.out.println("Cezaniz 500$");
    //       }
    //   }
    //   else if (currentSpeed < 55) {
    //           System.out.println("Ehliyetsiz arac kullandiginiz icin cezaniz 200$ dir...");
    //       }
    //   else if (currentSpeed < 75) {
    //           System.out.println("Cezaniz 300$");
    //       }
    //   else if (currentSpeed < 85) {
    //           System.out.println("Cezaniz 350$");
    //       }
    //   else if (currentSpeed < 95) {
    //           System.out.println("Cezaniz 520$");
    //       }
    //   else {
    //           System.out.println("Cezaniz 700$");
    //       }
        int ceza = 0;
            if (currentSpeed < 75 && currentSpeed>=55) ceza = 100;
            else if (currentSpeed < 85) ceza = 150;
            else if (currentSpeed < 95) ceza = 320;
            else ceza = 500;
        if (!isDriverLicenceAvailable) ceza+=200;

        System.out.println("cezaniz " + ceza + " $'dir");

        }


    }


