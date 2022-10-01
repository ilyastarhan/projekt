package Homework.eylul14;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen günde kac saat uyudugunuzu giriniz: ");
        int uyku_saati = scan.nextInt();
        System.out.println("Ayda " + uyku_saati*30/24 + ", yilda " + uyku_saati*365/24 + ", 40 yilda " + uyku_saati*365*40/24 + " gününüz uykuda geciyor." );

    }
}
