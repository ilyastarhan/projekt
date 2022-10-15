package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyOf(arr,newLength); -> girilen arr yin newlength kadar ilk elemanini kopyalar

        int sayi[] = {63,21,47,27,35,12,36,31,46,24};
        int yeniArr[] = Arrays.copyOf(sayi, 5);
        System.out.println(Arrays.toString(yeniArr));
        //Array copyOfRange
        int yeni2Arr[] = Arrays.copyOfRange(sayi, 4,5);
        System.out.println(Arrays.toString(yeni2Arr));
        //Arrayi belirli bir eleman ile update etme.. fill(arr, value);
        Arrays.fill(sayi,99);
        System.out.println(Arrays.toString(sayi));
        Arrays.fill(sayi, 5,9,75);
        System.out.println(Arrays.toString(sayi));
    }
}
