package j15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("array uzunlugunu giriniz: ");

        int arr[] = new int[scan.nextInt()];
        int toplam = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.println("sayi giriniz: ");
            arr[i] = scan.nextInt();
            toplam+=arr[i];
        }

        System.out.println("toplam = " + toplam);


    }
}
