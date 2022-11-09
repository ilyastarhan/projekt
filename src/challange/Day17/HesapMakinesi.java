package challange.Day17;

import java.util.Scanner;

public class HesapMakinesi {
    double num1;
    double num2;
    char secim;

    public HesapMakinesi() {
    }

    public HesapMakinesi(double num1, double num2, char secim) {
        this.num1 = num1;
        this.num2 = num2;
        this.secim = secim;
    }
    public double toplama(double num1, double num2){
        return num1+num2;
    }
    public double cikarma(double num1, double num2){
        return num1-num2;
    }
    public double carpma(double num1, double num2){
        return num1*num2;
    }
    public double bolme(double num1, double num2){
        return num1/num2;
    }
    public void giris(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi giriniz:");
        this.num1 = scan.nextDouble();
        System.out.println("Lütfen 2. sayiyi giriniz:");
        this.num2 = scan.nextDouble();
        System.out.println("Lütfen isleminizi seciniz: \nToplama(+)\nCikarme(-)\nCarpma(*)\nBölme(/)");
        this.secim = scan.next().charAt(0);
        hesapla();
    }
    public void hesapla(){
        switch (secim) {
        case '+':
            System.out.println("Toplama sonucu = " + toplama(num1,num2));
        break;
            case '-':
                System.out.println("Cikarma sonucu = " + cikarma(num1, num2));
                break;
            case '*':
                System.out.println("Carpma sonucu  = " + carpma(num1, num2));
                break;
            case '/':
                System.out.println("Bölme sonucu = " + bolme(num1, num2));
                break;
        }
    }
}
