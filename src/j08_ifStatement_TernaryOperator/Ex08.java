package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen cinsiyeti giriniz. Erkek icin 'E', Kadin icin 'K'");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        if (cinsiyet == 'K') {
            System.out.print("Lütfen yasi giriniz: ");
            int yas = scan.nextInt();
            if (yas > 60) {
                System.out.print("Lütfen prim gününü giriniz: ");
                int prim = scan.nextInt();
                if (prim >= 6000) {
                    System.out.println("Emekli olabilirsiniz");
                } else {
                    System.out.println("Emekli olabilmeniz icin " + (6000 - prim) + " gün daha calismaniz gerekmektedir...");
                }
            } else {
                System.out.println("Emeklilik icin yas sartini doldurmadiniz gerekmektedir");
            }
        } else if (cinsiyet == 'E') {
            System.out.print("Lütfen yasi giriniz: ");
            int yas = scan.nextInt();
            if (yas > 65) {
                System.out.print("Lütfen prim gününü giriniz: ");
                int prim = scan.nextInt();
                if (prim >= 7000) {
                    System.out.println("Emekli olabilirsiniz");
                } else {
                    System.out.println("Emekli olabilmeniz icin " + (7000 - prim) + " gün daha calismaniz gerekmektedir...");
                }
            } else {
                System.out.println("Emeklilik icin yas sartini doldurmadiniz gerekmektedir");
            }


        } else {
            System.out.println("hatali bir karakter girdiniz....");
        }
    }
}