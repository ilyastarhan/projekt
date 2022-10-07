package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayi giriniz: ");

        for(int i = scan.nextInt(); i <100; i++){
            if(i%4==0){
                System.out.println(i);
            }

        }



    }}