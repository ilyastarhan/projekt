package Homework.ekim10;

import java.util.Scanner;

public class T03_TasKagitMakas {
    static Scanner scan = new Scanner(System.in);
    static int oyuncu;
    static int oyuncupuan = 0;
    static int computerpuan = 0;
    static int computer;

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        //kagit >tas

        System.out.println("'Tas', 'Kagit', 'Makas' oyununa hosgeldiniz...");
            for (int j = 3; j > 0; j--) {
                oyuncukarar();

                computerkarar();
                if (oyuncu == 1 && computer == 1 || oyuncu == 2 && computer == 2 || oyuncu == 3 && computer == 3) {
                    if (oyuncu == 1) {
                        System.out.println("Ikiniz de 'Tas' dediniz...");
                        skor();
                    } else if (oyuncu == 2) {
                        System.out.println("Ikiniz de 'Kagit' dediniz...");
                        skor();
                    } else {
                        System.out.println("Ikiniz de 'Makas' dediniz...");
                        skor();
                    }
                } else if (oyuncu == 1 && computer == 2) {
                    System.out.println("Bilgisayar kazandi");
                    computerpuan++;
                    skor();
                } else if (oyuncu == 1 && computer == 3) {
                    System.out.println("Oyuncu kazandi...");
                    oyuncupuan++;
                    skor();
                } else if (oyuncu == 2 && computer == 1) {
                    System.out.println("Oyuncu kazandi");
                    oyuncupuan++;
                    skor();
                } else if (oyuncu == 2 && computer == 3) {
                    System.out.println("Bilgisayar kazandi");
                    computerpuan++;
                    skor();
                } else if (oyuncu == 3 && computer == 1) {
                    System.out.println("Bilgisayar kazandi");
                    computerpuan++;
                    skor();
                } else if (oyuncu == 3 && computer == 2) {
                    System.out.println("Oyuncu kazandi");
                    oyuncupuan++;
                    skor();

            }

        }
        System.out.println();
        System.out.println("**********Mac sonucu***********");
        skor();
        System.out.println();
        if (oyuncupuan > computerpuan) {
            System.out.println("Oyuncu kazandi");
        } else if (computerpuan > oyuncupuan) {
            System.out.println("Bilgisayar kazandi");
        } else System.out.println("Oyun berabere sona erdi...");

    }

    private static void skor() {
        System.out.println();
        System.out.println("********Skor durumu*******");
        System.out.println("Oyuncu puani = " + oyuncupuan);
        System.out.println("Bilgisayar puani = " + computerpuan);
        System.out.println();
    }

    private static void computerkarar() {
        computer = (int) (Math.random() * 3);
        switch (computer) {
            case 1:
                System.out.println("Bilgisayar tas dedi");
                break;
            case 2:
                System.out.println("Bilgisayar kagit dedi");
                break;
            case 3:
                System.out.println("Bilgisayar makas dedi");
                break;
        }
    }

    private static void oyuncukarar() {
        System.out.println("Oyuncu 1 lütfen seciniz: \nTas->1\nKagit->2\nMakas->3");
        oyuncu = scan.nextInt();
        switch (oyuncu) {
            case 1:
                System.out.println("Oyuncu tas dedi");
                break;
            case 2:
                System.out.println("Oyuncu kagit dedi");
                break;
            case 3:
                System.out.println("Oyuncu makas dedi");
                break;
            default:
                System.out.println("Hatali secim yaptiniz...\nLütfen tekrar deneyiniz...");
                oyuncukarar();
                break;
        }
    }
}
