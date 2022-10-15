package j15_Arrays;

import java.util.Arrays;

public interface C02_Arrays {
    public static void main(String[] args) {
       // Array elemani varligini kontrol etme

        int arr[] = {67,97,20,63,43,34,54,24,16,7,55,17};
        int sayi = 21;
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == sayi) flag = true;
            break;
        }
        System.out.println(flag);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //Array elemanlari siralandi
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 34));
        System.out.println(Arrays.binarySearch(arr, 17));
        System.out.println(Arrays.binarySearch(arr, 21));
        //Trick --> Methodu Array da olmayan elemani calisirsa eger bu eleman array de olsaydi
        //kacinci sirada olurdu nun cevabini verir.
    }
}
