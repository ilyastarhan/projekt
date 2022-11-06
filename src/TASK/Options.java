package TASK;

import java.util.Scanner;

public class Options {
    Scanner scan = new Scanner(System.in);
    Urun urun = new Urun();


    public void select() {
        System.out.println("Lütfen istediginiz ürünü listeden seciniz: ");
        System.out.println(urun.toString());
        switch (scan.nextInt()) {
            case 1:
                urun.accountBalance -= urun.kraker;
                break;
            case 2:
                urun.accountBalance -= urun.cips;
                break;
            case 3:
                urun.accountBalance -= urun.cocaCola;
                break;
            case 4:
                urun.accountBalance -= urun.fanta;
                break;
            case 5:
                urun.accountBalance -= urun.su;
                break;
            case 6:
                urun.accountBalance -= urun.cay;
                break;
            case 7:
                urun.accountBalance -= urun.filtreKahve;
                break;
            case 8:
                System.out.println(urun.accountBalance);
                break;
            default:
                System.out.println("hatali secim yaptiniz...\nTekrar deneyiniz...");
                select();
                break;

        }

    }

    public void balance(double price, double accountBalance, Urun product) {


    }

    public void purchase(double price, double accountBalance, Urun product) {


    }
}
