package Homework.eylul28.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 sayi giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        enkucuksayi(a,b,c);


    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */



    }

    private static void enkucuksayi(int a, int b, int c) {
        if (a < b && a < c) {
                System.out.println("En kücük sayi: " + a);
            }
        else if (c < a && c < b) {
                System.out.println("En kücük sayi: " + c);
            }
        else System.out.println("En kücük sayi: " + b);

        }



    }




