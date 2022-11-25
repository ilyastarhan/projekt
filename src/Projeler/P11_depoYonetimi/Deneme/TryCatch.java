package Projeler.P11_depoYonetimi.Deneme;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    static Scanner scan = new Scanner(System.in);
    static int sayiGir(){
        int sayi;
        while (true) {
            try{
                sayi = scan.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Lütfen sayi giriniz...");
                scan.nextLine();
            }
        }
        scan.nextLine();
        return sayi;
    }
}
