package alistirmalar;

import java.util.ArrayList;
import java.util.Arrays;

public class Yunus2 {
    public static void main(String[] args) {
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("12.99", "23.68", "54.45"));
        double toplam =0;
        for (String s : list3) {
            toplam+= Double.parseDouble(s);
        }
        System.out.println(toplam);

        ArrayList<Integer> arrList2 = new ArrayList<>(Arrays.asList(-34,-38,-7,-4,12,31,15,33,54));
      //  Collections.sort(arrList2);
        System.out.println(arrList2);
        int min = Integer.MAX_VALUE;
        int sayi1= 0;
        int sayi2 =0;
        for(int i = 0; i < arrList2.size()-1; i++) {
            if(Math.abs(arrList2.get(i+1)-arrList2.get(i))<min){
                min = Math.abs(arrList2.get(i+1)-arrList2.get(i));
                sayi1 = arrList2.get(i+1);
                sayi2 = arrList2.get(i);
            }
        }
        System.out.println("sayi1  ve sayi2 = " + sayi1 + ", " + sayi2);
        System.out.println();
        //Soru--> 1
        //     int kareleriToplami = 0;
        //     int toplamlari = 0;
        //     int fark;
        //     for (int i = 0; i <= 100; i++) {

        //         kareleriToplami += (i * i);
        //         toplamlari += i;
        //     }
        //     fark = (toplamlari * toplamlari) - kareleriToplami;
        //     System.out.println("fark = " + fark);

        //     //Soru--> 2
        //    ArrayList<Integer> asalList = new ArrayList<Integer>();
        //    System.out.println(Integer.MAX_VALUE);
//
        //   for (int i = 2; i < 200; i++) {
        //       int count = 0;
        //       for (int j = 2; j < i; j++) {
        //           if (i % j == 0) {
        //               count++;
        //               break;
        //           }
        //       }
        //       if (count == 0) {
        //           asalList.add(i);
        //       }
        //   }
        //   System.out.println(asalList.size());
        //   System.out.println(asalList);
        //     System.out.println(asalList.get(10000));

        //Soru--> 3

          ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23, 13, 56, 45, 89, 74, 12, 3, 12, 13, 24, 21, 25, 89, 74));

          for (int i = 0; i < list.size(); i++) {
              if (list.get(i) == 12 || list.get(i) == 13 ) {
                  list.remove(i);
                  i--;
//
              }
          }
          System.out.println(list);

          ArrayList<Integer> list2 = new ArrayList<Integer>();


        //Soru--> 4

        //     String[] arr = {"Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        //
        //     String enKisa = arr[0];
        //     for(int i = 0; i < arr.length; i++){
        //         if(arr[i].length() < enKisa.length()){
        //             enKisa = arr[i];
        //         }
        //     }
        //    System.out.println(enKisa);

        //soru --> 5
        String str = "accessories";
        String yeni = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    yeni += str.charAt(i);
                }
            }
        }

    }
}