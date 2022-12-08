package Projeler.aracKiralama;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    static Scanner scan = new Scanner(System.in);
    public static int sayiGir(int min, int max){

        int secim;
        while(true){
            try{
                secim = scan.nextInt();
                if(secim >= min && secim <= max) {
                    break;
                }
                else throw new InputMismatchException();
            }
            catch(InputMismatchException e){
                System.out.println("Lütfen gecerli bir secim yapiniz: ");
                scan.nextLine();
            }
        }
        scan.nextLine();
        return secim;
    }
    public static String yaziGir(){
        String str;
        while(true){
            try{
            str = scan.nextLine();
            break;
        }
        catch (Exception e){
            System.out.println("Lütfen gecerli bir secim yapiniz: ");
            scan.nextLine();
        }

        }
        scan.nextLine();
        return str;
    }
}
