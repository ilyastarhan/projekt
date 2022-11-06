package alistirmalar.diger;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int v1, v2, finalnotu;
        int not_ortalamasi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Vize-1 notunuzu giriniz: ");
        v1 = scan.nextInt();

        System.out.println("Lütfen Vize-2 notunuzu giriniz");
        v2 = scan.nextInt();

        System.out.println("Lütfen Final notunuzu giriniz");
        finalnotu = scan.nextInt();

        not_ortalamasi = (int) ((v1*0.20) + (v2*0.20) + (finalnotu*0.60));

        if (not_ortalamasi >=90.0) {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nNotunuz AA dir");}
        else if (not_ortalamasi >= 85.0) {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nNotunuz BA dir");}
        else if (not_ortalamasi >= 80.0) {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nNotunuz BB dir");}
        else if (not_ortalamasi >= 75.0) {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nNotunuz CB dir");}
        else if (not_ortalamasi >= 70.0) {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nNotunuz CC dir");}
        else if (not_ortalamasi >= 65.0) {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nNotunuz DC dir");}
        else if (not_ortalamasi >= 60.0) {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nNotunuz DD dir");}
        else {
            System.out.println("Not ortalamaniz: " + not_ortalamasi + "\nDersten gecemediniz...");}


    }
}
