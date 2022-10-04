package challange.Day06;

import java.util.Scanner;

public class Q03_MethodCreation {
    public static void main(String[] args) {
        /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int num = scan.nextInt();

        negatifmi(num);
        System.out.println(Q01_MethodCreation.isEven(num));
        toplam(num);
    }

    private static void toplam(int num) {
        int toplam;
        if(num >= 100 && num < 1000) {
            toplam = (num %10) + (num / 10) % 10 + (num / 100);
            System.out.println(toplam);
        }
        else if(num <100){
            toplam = num %10;
            System.out.println(toplam);
        }
    else System.out.println("girdiginiz sayi 3 basamakli degil");}

        private static void negatifmi ( int num){
            if (num < 0) {
                System.out.println("negatif");
            } else if (num > 0) {
                System.out.println("pozitif");
            } else System.out.println("nötr");
        }
    }

