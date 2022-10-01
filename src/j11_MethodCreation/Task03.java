package j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi giriniz: ");
        double num1 = scan.nextDouble();
        System.out.println("Lütfen 2. sayiyi giriniz: ");
        double num2 = scan.nextDouble();

        System.out.println(islem(num1, num2));
        int sonuc2 = (int) islem(24,25);
        System.out.println(sonuc2);


    }

    private static double islem(double a, double b) {

        Scanner scan = new Scanner(System.in);
        double sonuc = 0;
        System.out.println("Lütfen isleminizi seciniz \n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bölme");
        int secim = scan.nextInt();


        switch (secim) {
            case 1:
                sonuc = a + b;
                break;
            case 2:
                sonuc = a - b;
                break;
            case 3:
                sonuc = a * b;
                break;
            case 4:
                sonuc = a / b;
                break;

        }
        //  if (secim == 1) {
        //      sonuc = a + b;
        //  } else if (secim == 2) {
        //      sonuc = a - b;
        //  } else if (secim == 3) {
        //      sonuc = a * b;
        //  } else if (secim == 4) {
        //      sonuc = a / b;
        //  } else
        //      System.out.println("hatali giris yaptiniz...");
        return sonuc;


    }
}