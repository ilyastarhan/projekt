package Homework.ekim13;

import java.util.Scanner;

public class Salyangoz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Salyangoz matrisin boyutu kaç olsun AĞAM: ");
        int boyut = scan.nextInt();
        int max = boyut;
        int matris[][] = new int[boyut][boyut];

        int satir = 0;
        int sutun = -1;
        int value = 1;
        int gecis = 1;

        for (int i = 0; i < boyut; i++) { //Salyangoz Arrayi oluşturuyoruz.
            for (int j = 0; j < max; j++) {
                sutun += gecis;
                matris[satir][sutun] = value++;
            }
            max--;
            for (int j = 0; j < max; j++) {
                satir += gecis;
                matris[satir][sutun] = value++;
            }
            gecis *= -1;
        }
        for (int i = 0; i < boyut; i++) {//Salyangoz Arrayimizi yazdırıyoruz.
            for (int j = 0; j < boyut; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

