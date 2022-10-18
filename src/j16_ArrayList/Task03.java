package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // bir listte istenen sayinin varligini kontrol eden code create ediniz:
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> listSayi = new ArrayList<Integer>(Arrays.asList(1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38));
        boolean varMi = false;
        System.out.println("Lütfen aramak istediginiz sayiyi giriniz: ");
        int num = scan.nextInt();
        for(int i = 0 ; i < listSayi.size() ; i++) {
            if(listSayi.get(i) == num){
                varMi=true;
                System.out.println("aradiginiz sayi mevcut");
                break;
            }
        }
        if(!varMi){
            System.out.println("aradiginiz sayi mevcut degil");
    }
}}
