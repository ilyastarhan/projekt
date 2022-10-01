package j09_Switch_Statement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen girilen ay numarsini giriniz ");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bu ay 31 gündür");
                break;
            case 2:
                System.out.println("Lütfen hangi yilda oldugunuzu giriniz");
                int yil = scan.nextInt();
                if ((yil % 4 == 0 && yil % 100 == 0) || yil % 400 == 0)
            {
                System.out.println("Bu ay 29 gündür");
            }
                else{
                System.out.println("bu ay 28 gündür");
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu ay 30 gündür");
                break;
            default:
                System.out.println("Yanlis bir tusa bastiniz...");


        }


    }
}