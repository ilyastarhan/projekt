package challange.Day11;


import java.util.ArrayList;
import java.util.Scanner;

public class Q07_ArrayList {
    static  Scanner scan = new Scanner(System.in);
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


        tekrarliSayilar();

    }

    private static void tekrarliSayilar() {
        System.out.println("Lütfen liste uzunlugunu giriniz: ");
        int uzunluk = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>(scan.nextInt());
        ArrayList<Integer> yeniList = new ArrayList<>();
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
        if(yeniList.isEmpty()){
            System.out.println("tekrarli sayi yok");}
        else
            System.out.println("tekrarli sayilar = " + yeniList);

    }
}

