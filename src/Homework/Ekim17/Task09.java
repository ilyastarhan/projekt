package Homework.Ekim17;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* Projeler.TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sayiListem = new ArrayList<>();
        boolean devamMI = true;
        while(devamMI){
            System.out.println("Lütfen sayi giriniz: ");
            sayiListem.add(scan.nextInt());
            System.out.println("devam etmek icin -> 'E' \n cikmak icin 'H'");
            char ch = scan.next().toLowerCase().charAt(0);
            if (ch == 'h')
                devamMI = false;
        }
        System.out.println("sayi listem= " + sayiListem);
        System.out.println("girilen sayilarin kareleri : " + girilenSayilarinKareleri(sayiListem));
        System.out.println("girilen sayilarin kareleri toplami = " + girilenSayilarinKareleriToplami(sayiListem));
    }

    private static ArrayList<Integer> girilenSayilarinKareleri(ArrayList<Integer> sayiListem) {
        ArrayList<Integer> sayilarinKareleri = new ArrayList<>(sayiListem.size());
        for(int i = 0; i < sayiListem.size(); i++) {
            sayilarinKareleri.add(sayiListem.get(i)*sayiListem.get(i)) ;
        }
        return sayilarinKareleri;
    }

    private static int girilenSayilarinKareleriToplami(ArrayList<Integer> sayiListem) {
        int kareleriToplami =0;
        for(int i = 0; i < sayiListem.size(); i++) {
            kareleriToplami+= (sayiListem.get(i)*sayiListem.get(i));
        }
        return kareleriToplami;

    }
}

