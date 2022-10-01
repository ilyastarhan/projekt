package j09_Switch_Statement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        while(true){
        System.out.println("Hosgeldiniz. Lütfen yapmak istediginiz islemi seciniz...");
        System.out.println("Bakiye ögrenme icin -> 1 \nPara yatirmak icin -> 2\nPara cekmek icin -> 3\nCikmak icin ->4");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("bakiyeniz = " + bakiye + "Tl'dir");
                break;
            case 2:
                System.out.print("Lütfen hesabiniza yatirmak istediginiz tutari giriniz: ");
                int tutar = scan.nextInt();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz = " + bakiye + " Tl'dir");
                break;
            case 3:
                System.out.print("Lütfen cekmek istediginiz tutari giriniz: ");
                tutar = scan.nextInt();
                if (tutar > bakiye) {
                    System.out.println("Hesabinizda yeterli bakiyeniz bulunmamaktadir");
                } else {
                    bakiye -= tutar;
                    System.out.println("yeni bakiyeniz = " + bakiye + " Tl'dir");
                }
                break;
            case 4:
                System.out.println("Sistemden cikiliyor");
                break;
            default:
                System.out.println("Hatali bir islem yaptiniz");
        }


    }
}}