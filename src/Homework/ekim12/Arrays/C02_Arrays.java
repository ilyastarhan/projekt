package Homework.ekim12.Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Array elemanı varlığını  kontrol etme...
        int arr[]={67, 97,20,63,43,34,54,24,16,7,55,17};

        int sayi=34;

        boolean flag=false;//bayrak aşağıda
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("aradığınız sayı array de VAR :) ");
        }else {
            System.out.println("aradığınız sayı array de YOK :( ");
        }

        Arrays.sort(arr);//array elemanları sırlanadı
        System.out.println(Arrays.toString(arr));//[7, 16, 17, 20, 24, 34, 43, 54, 55, 63, 67, 97]

        System.out.println(Arrays.binarySearch(arr, 34));//5 binarySearch(arr,34); -> method aranan elemanı arrayda arayıp index return eder
        System.out.println(Arrays.binarySearch(arr, 16));//1 binarySearch(arr,34); -> method aranan elemanı arrayda arayıp index return eder
        System.out.println(Arrays.binarySearch(arr, 21));//-5 binarySearch(arr,34); -> method aranan elemanı arrayda arayıp index return eder
        // trick-> binarySearch() methodu arrayde olmayan elemanı çalışırsa sonuç olarak: eğer bu eleman arrayde olsaydı kacıncı SIRA'da olurdu cevabını verir
        System.out.println(Arrays.binarySearch(arr, 99));//-13 binarySearch(arr,34); -> method aranan elemanı arrayda arayıp index return eder
    }
}
