package challange.Day10;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int arr[] = new int[8];
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lütfen arrayin" + i + ". indexini giriniz: ");
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
                sayac++;
            }
        }
        System.out.println("girdiginiz dizide 3'e bölünebilen eleman sayisi = " + sayac);
    }
}
