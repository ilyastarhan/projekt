package Homework.ekim04;


import java.util.Scanner;

public class Task02 {
    static Scanner scan = new Scanner(System.in);
    static int oyuncu1Puan=0;
    static int oyuncu2Puan=0;
    static int numberOfFirstWin = 0;
    static int numberOfSecondWin = 0;
    static int numberOfComWin = 0;
    static int gameOver = 3;

    public static void main(String[] args) {

        do {
            System.out.print("Oyuncu1\n<T>aş  <M>akas  <K>ağıt ");
            char oyuncu1Karar = scan.next().toUpperCase().charAt(0);
            System.out.print("Oyuncu2\n<T>aş  <M>akas  <K>ağıt ");
            char oyuncu2Karar = scan.next().toUpperCase().charAt(0);
            System.out.println("Java karar veriyor şimdi :) ");
            char java = javaKarar();
            karar(oyuncu1Karar, oyuncu2Karar, numberOfFirstWin, numberOfSecondWin);
            karar(oyuncu1Karar, java, numberOfFirstWin, numberOfComWin);
            karar(oyuncu2Karar, java, numberOfSecondWin, numberOfComWin);
            System.out.println("oyuncu1 Puanı = " + numberOfFirstWin + " oyuncu2 Puanı = " + numberOfSecondWin
                    + " Javanın Puanı = " + numberOfComWin);

        } while (numberOfComWin < gameOver && numberOfFirstWin < gameOver && numberOfSecondWin < gameOver);
        System.out.println("döngü bitti");

    }

    public static char javaKarar() {
        char karar = ' ';
        double sayi = (double) (Math.random() * 3);
        int net = (int) sayi;
        switch (net) {
            case 0:
                karar = 'T';
                break;
            case 1:
                karar = 'M';
                break;
            case 2:
                karar = 'K';
                break;
        }
        return karar;
    }

    public static void karar(char oyuncu1, char oyuncu2, int oyuncu1Puan, int oyuncu2Puan) {
        if (oyuncu1 == 'T' && oyuncu2 == 'T' || oyuncu1 == 'M' && oyuncu2 == 'M' || oyuncu1 == 'K' && oyuncu2 == 'K') {
            System.out.println("İki oyuncuda aynı seçimi yaptı , kimse puan kazanamadı");
        } else if (oyuncu1 == 'T' && oyuncu2 == 'M' || oyuncu1 == 'K' && oyuncu2 == 'T'
                || oyuncu1 == 'M' && oyuncu2 == 'K') {
            oyuncu1Puan++;
        } else if (oyuncu1 == 'T' && oyuncu2 == 'K' || oyuncu1 == 'K' && oyuncu2 == 'M'
                || oyuncu1 == 'M' && oyuncu2 == 'T') {
            oyuncu2Puan++;
        }

    }
    }
