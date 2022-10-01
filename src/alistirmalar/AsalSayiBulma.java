package alistirmalar;

import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        boolean asal = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }}
        if(asal) {
                System.out.println("Girdiginiz sayi asal sayidir");

            }
        else{
            System.out.println("Girdiginz sayi asal degildir");
        }
    }}