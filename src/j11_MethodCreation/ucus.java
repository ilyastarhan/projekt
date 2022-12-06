package j11_MethodCreation;

import java.util.Scanner;

public class ucus {

         /*
        A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
        Bilet tarifesi:
        km birim fiyati : 0.10$
        yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
        12 ve 24 yas arasindaysa 10% indirim,
        65 yasindan buyukse 30% indirim,
        bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */


        static double ucret;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Gitmek istefiginiz sehri secinit \n1-> B Sehri \n2-> C sehri\n3-> D Sehri");
        int sehirSecim = tryCatch(1,3);
        System.out.println("yasinizi giriniz: ");
        int yas = tryCatch(0,100);
        System.out.println("Tek yön icin -> 1\nCIft yon icin -> 2");
        int yon = tryCatch(1,2);
        ucretHesapla(sehirSecim,yas,yon);

    }
    public static int tryCatch(int min, int max){
        System.out.println("Lütfen " + min + " ve " + max + " arasinda deger giriniz");
        int secim;
        while(true){
            try{
                secim = scan.nextInt();
                if(secim>=min && secim<=max){
                    break;
                }
                else throw new Exception();
            }
            catch(Exception e){
                System.out.println("Lütfen belirtilen degerler arasinda sayi giriniz!");
                scan.nextLine();
            }
        }
        return secim;
    }

    private static void ucretHesapla(int sehirSecim, int yas, int yon) {
        ucret= sehirSecim(sehirSecim)*yasIndirimi(yas)*yonIndirimi(yon);
        System.out.println(ucret);

    }

    private static double sehirSecim(int sehirSecim){
        if(sehirSecim==1)
            ucret=500*0.10;
        else if(sehirSecim==2)
            ucret = 700*0.10;
        else if (sehirSecim==3)
            ucret = 900*0.10;
        return ucret;
    }
    private static double yonIndirimi(int yon){
        if(yon==2)
            return 2*0.80;
        else return 1;
    }

    static double yasIndirimi(int yas){
        if(yas<=12)
            return 0.50;
        else if(yas<=24)
            return 0.90;
        else if(yas >=65)
            return 0.70;
        else
            return 1;
    }
}
