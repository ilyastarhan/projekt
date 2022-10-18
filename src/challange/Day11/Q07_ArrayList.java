package challange.Day11;


import java.util.ArrayList;
import java.util.Scanner;

public class Q07_ArrayList {
    public static void main(String[] args) {


        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen liste uzunlugunu giriniz: ");
        int uzunluk = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(uzunluk);
        ArrayList<Integer> yeniList = new ArrayList<Integer>();
        for(int i=0; i< uzunluk; i++) {
            System.out.println("Lütfen listenin " + (i + 1) + ". elemanini giriniz: ");
            list.add(scan.nextInt());
        }
        for(int i=0; i< list.size(); i++) {
            for(int j=i+1; j< list.size(); j++){
                if(list.get(i).equals(list.get(j)))
                    yeniList.add(list.get(i));
            }
        }
        System.out.println("yeniList = " + yeniList);


    }
}

