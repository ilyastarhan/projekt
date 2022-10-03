package j11_MethodCreation;

import java.util.Scanner;

public class Task04AtmMethods {
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 1000;

    public static void secim() {
        System.out.println("Lütfen yapmak istediginiz islemi seciniz...");
        System.out.println("Bakiye ögrenme icin -> 1 " +
                "\nPara yatirmak icin -> 2\nPara cekmek icin -> 3\nCikmak icin ->4");
        int secim = scan.nextInt();
        if (secim == 1) bakiye();
        else if (secim == 2) parayatirma();
        else if (secim == 3) paracekme();
        else if (secim == 4) cikis();
        else System.out.println("hatali secim yaptiniz...");
    }
    private static void bakiye() {
        System.out.println("bakiyeniz = " + bakiye + "Tl'dir");
        karar();
    }
    private static void parayatirma() {
        System.out.print("Lütfen hesabiniza yatirmak istediginiz tutari giriniz: ");
        int tutar = scan.nextInt();
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz = " + bakiye + " Tl'dir");
        karar();
    }
    public static void paracekme() {
        System.out.print("Lütfen cekmek istediginiz tutari giriniz: ");
        int tutar = scan.nextInt();
        if (tutar > bakiye) {
            System.out.println("Hesabinizda yeterli bakiyeniz bulunmamaktadir");
        } else {
            bakiye -= tutar;
            System.out.println("yeni bakiyeniz = " + bakiye + " Tl'dir");
        }
        karar();
    }
    public static void cikis() {
        System.out.println("Sistemden cikiliyor");
    }
    public static void karar() {
        System.out.println("devam icin ->1 cikmak icin 2->");
        int karar = scan.nextInt();
        if (karar == 2) {
            cikis();
        } else if (karar == 1){secim();}
        else System.out.println("hatali secim yaptiniz...");
    }







}
