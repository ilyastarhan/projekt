package alistirmalar;

import java.time.Duration;
import java.time.LocalDate;

public class yunus {
    public static void main(String[] args) {
// Soru-->1
   //    int max = Integer.MIN_VALUE;
   //    int num1 = 0;
   //    int num2 = 0;
   //    for (int i = 999; i >= 100; i--) {
   //        for (int j = 999; j >= 100; j--) {
   //            String reverse = "";
   //            String multiply = "" + (i * j);
   //            for (int k = multiply.length() - 1; k >= 0; k--) {
   //                reverse += multiply.charAt(k);
   //            }
   //            if (multiply.equals(reverse) && Integer.parseInt(multiply) > max) {
   //                max = Integer.parseInt(multiply);
   //                num1 = i;
   //                num2 = j;
   //            }
   //        }
   //    }
   //    System.out.println(num1 + "*" + num2 + " = " + max);

   //    // Soru-->2
   //    /*
   //    2) 2520, 1'den 10'a kadar olan sayıların her birine kalansız
   //    bölünebilen en küçük sayıdır.
   //    1'den 20'ye kadar olan sayıların tamamına tam bölünebilen en küçük pozitif sayı
   //    kaçtır ?
   //    */
   //    boolean result = false;
   //    int sayi = 0;
   //    for (int i = 2; i < Integer.MAX_VALUE; i++) {
   //        for (int j = 2; j < 10; j++) {
   //            if (i % j != 0) {
   //                result = false;
   //                break;
   //            } else result = true;
   //        }
   //        if (result == true) {
   //            sayi = i;
   //            break;
   //        }
   //    }
   //    System.out.println(sayi);

   //    // Soru-->3
   //    Scanner scan = new Scanner(System.in);
   //    System.out.println("Enter password: ");
   //    String password = scan.nextLine();
   //    String isPasswordValid = password.replaceAll(" ", "").length() >= 8 ?
   //            "Valid Password" : "invalid Password";
   //    System.out.println(isPasswordValid);

// Soru-->4
        System.out.println("Hangi ayda oldugunu gir: ");
  //   String ay = scan.next().toLowerCase();
  //   switch (ay) {
  //       case "aralik":
  //       case "ocak":
  //       case "subat":
  //           System.out.println("KIS");
  //           break;
  //       case "mart":
  //       case "nisan":
  //       case "mayis":
  //           System.out.println("ILKBAHAR");
  //           break;
  //       case "haziran":
  //       case "temmuz":
  //       case "agustos":
  //           System.out.println("YAZ");
  //           break;
  //       case "eylül":
  //       case "ekim":
  //       case "kasim":
  //           System.out.println("SONBAHAR");
  //           break;
  //       default:
  //           System.out.println("Hatali girdiniz...");
  //   }
//Soru-->5



 //     LocalTime localTime = LocalTime.now();
 //     if (localTime.getHour() < 5) {
 //         System.out.println("uyku zamani");
 //     } else if (localTime.getHour() >= 8 && localTime.getHour() < 16) {
 //         System.out.println("Calisma Zamani");
 //     } else if (localTime.getHour() >= 19 && localTime.getHour() < 22) {
 //         System.out.println("Aile zamani");
 //     } else System.out.println("Kisisel zaman");


 //     //soru-->6
        //6) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        // Ali'nin doğum tarihi 12 Mayıs 2002'dir.

        LocalDate date = LocalDate.now();
        LocalDate ali = LocalDate.of(2002, 5, 22);
        Duration fark = Duration.between(date,ali);
        System.out.println(fark.toDays());

//        // Soru-->7
//        System.out.println();
//        System.out.println("Sehir ismi giriniz");
//        String sehir = scan.nextLine().toUpperCase();
//        String yeniIsim = "" + sehir.charAt(0) + sehir.substring(1).toLowerCase();
//        System.out.println(yeniIsim);
// Soru-->8
        byte minByte = Byte.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        int toplam = minByte + maxShort;
        System.out.println(toplam);
// Soru-->9
        short a = 13132;
        int b = a;
        System.out.println(b);

    }


}

