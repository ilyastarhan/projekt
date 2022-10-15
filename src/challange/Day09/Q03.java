package challange.Day09;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        boolean devamMi = true;
        int sayac = 0;
        while(devamMi){

            System.out.println("Lütfen sayi giriniz");
            int sayi = scan.nextInt();
            toplam+=sayi;
            System.out.println("devam etmek istiyorsaniz 1'e cikmak icin 2'ye basiniz");
            int secim = scan.nextInt();
            devamMi = secim == 1;
            sayac++;
        }
        System.out.println("Toplam girilen sayi = " + sayac);
        System.out.println("Toplamlari = " + toplam);
    }
}
