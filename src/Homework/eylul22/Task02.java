package Homework.eylul22;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int gun = scan.nextInt();
        if (gun < 1 || gun > 6) {
            System.out.println("Hatali bir sayi girdiniz...");
        } else {
            System.out.println("Kac gun sonrasini ögrenmek istiyorsun: ");
            int gun2 = scan.nextInt();
            switch ((gun+gun2) % 7) {
                case 0:
                    System.out.println("Pazar");
                    break;
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Sali");
                    break;
                case 3:
                    System.out.println("Carsamba");
                    break;
                case 4:
                    System.out.println("Persembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
            }

            //   if (yenigun % 7 == 0) {
            //       System.out.println("100 gün sonra : Pazar");
            //   } else if (yenigun % 7 == 1) {
            //       System.out.println("100 gün sonra : Pazartesi");
            //   } else if (yenigun % 7 == 2) {
            //       System.out.println("100 gün sonra : Sali");
            //   } else if (yenigun % 7 == 3) {
            //       System.out.println("100 gün sonra : Carsamba");
            //   } else if (yenigun % 7 == 4) {
            //       System.out.println("100 gün sonra : Persembe");
            //   } else if (yenigun % 7 == 5) {
            //       System.out.println("100 gün sonra : Cuma");
            //   } else {
            //       System.out.println("100 gün sonra : Cumartesi");

            //   }
        }
    }
}
