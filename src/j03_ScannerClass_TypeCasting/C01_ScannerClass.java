package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        //kullancidan veri almak icin su üc adim takip edilir
        //1. adim-> Scanner class'dan obje create edilir


        //2. adim-> Kullancidan istenen veri icin bildirimde bulunulur->sout("");


        //3. adim-> Kullanicinin girdigi veri data tipine göre bir variable alir.


/*
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :2
         Output : Yilda 12.41 kg seker kullaniyorsunuz

        Scanner input = new Scanner(System.in);
  /     System.out.println("bir günde ictiginiz cay sayisini giriniz: ");
        int cay = input.nextInt();
        System.out.println("bir bardak caya kac adet seker attiginizi giriniz:");
        int seker = input.nextInt();
        double tuketilen_seker = 365*cay*seker*1.7/1000;
        System.out.println("Bir yilda tükettiginiz seker = " + tuketilen_seker + "kg'dir");

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz: ");
        char ch = scan.nextLine().charAt(0);
        System.out.println("isminizin ilk karakteri = " + ch);


    }
}
