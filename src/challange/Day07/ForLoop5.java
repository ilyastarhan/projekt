package challange.Day07;

import java.util.Scanner;

public class ForLoop5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("rows : ");
        int rows = scan.nextInt();
        System.out.println("column : ");
        int column = scan.nextInt();
        for(int i = 0; i<rows; i++){

            for(int j =0; j<column; j++){

                System.out.print("*" + " ");
            }
            System.out.println();


        }
    }
}
