package TASK;

import java.util.Scanner;

public class Options {
    Scanner scan = new Scanner(System.in);


    public double select(Urun urun) {
        System.out.println(urun.toString());
        System.out.println("Cikis icin 8'e basiniz");
        System.out.println("Lütfen ürün seciniz: ");
        urun.productNum = scan.nextInt();
        switch (urun.productNum) {
            case 1:
                urun.setPrice(urun.getKraker());
                break;

            case 2:
                urun.setPrice(urun.getCips());
                break;

            case 3:
                urun.setPrice(urun.getCocaCola());
                break;

            case 4:
                urun.setPrice(urun.getFanta());
                break;

            case 5:
                urun.setPrice(urun.getSu());
                break;

            case 6:
                urun.setPrice(urun.getCay());
                break;

            case 7:
                urun.setPrice(urun.getFiltreKahve());
                break;
            case 8:
                System.out.println("Yine bekleriz");
                break;
            default:
                System.out.println("Hatali secim yaptiniz ..." +
                        " Tekrar secim yapiniz...");
                select(urun);
                break;
        }
        return urun.getPrice();
    }

    public double balance(double price, double accountBalance, Urun urun) {

        double fonlama;
        while (accountBalance < price) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Bakiyeniz yetersiz...\n" +
                    "Ekleme yapmak icin (Y) cikis icin (N)");
            char confirm = scan.next().toLowerCase().charAt(0);
            if (confirm == 'y') {
                System.out.println("lütfen eklemek istediginiz bakiyeyi giriniz: ");
                accountBalance += scan.nextDouble();
                System.out.println("Yeni bakiyeniz " + accountBalance);
                price = select(urun);
            } else if (confirm == 'n') {
                System.out.println("mevcut bakiyeniz " + accountBalance);
                System.out.println("Yine bekleriz...");
                break;
            }
        }

        return accountBalance;
    }
}


