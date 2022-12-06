package Team07.p6_Loops.break_Continue;

import java.util.Scanner;

public class Break {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int c = 0;
        int max = Integer.MIN_VALUE;
        while(c<5){
            System.out.println("Sayi gir: ");
            int sayi = scan.nextInt();
            if(sayi>max)
                max=sayi;
            c++;
        }
        System.out.println(max);

        int a = 35;

        for(int i=1; i<a; i++) {
            System.out.println(i + ". kayit");
            if(i == 15) {
                break;
            }
        }



        int b = 35;
        int count = 1;
        while(b >= 0) {
            System.out.println(count + ". kayit");
            if(count == 15) {
                break;
            }
            count++;
            b--;
        }
    }



}




