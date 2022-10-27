package challange.Day14;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        int[] arr2 = {3,5,8,77,45};
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2, 77));
        /*
        Java N ve M Boyutlu Dizinin Satırlarının Toplamını Bulma

        Bu örnekte N ve M değerlerini kullanıcıdan alıp, iki boyutlu dizi oluşturacağız.
        Daha sonra da dizinin elemanlarını kullanıcıdan alıp, her satırın sonuna o satırın toplamını yazdıracağız.


        örneğin;

        12    12     24
        5     15     20
        12    18     30

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen satir sayisini giriniz: ");
        int satir = scan.nextInt();
        System.out.println("Lütfen sütun sayisini giriniz: ");
        int sutun = scan.nextInt();
        int[][] arr = new int[satir][sutun];
        for(int i = 0; i < satir; i++) {
            for(int j = 0; j < sutun; j++) {
                System.out.println("Lütfen dizinin elemanini giriniz: ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Girilen dizi = " + Arrays.deepToString(arr));
        System.out.println();
        for(int i = 0; i<satir; i++){
            int toplam = 0;
            for(int j = 0 ; j < sutun; j++) {
                toplam+=arr[i][j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("= " + toplam);

        }
    }
}
