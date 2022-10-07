package Homework.ekim06;

import java.util.Scanner;

public class Odev07 {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - 1; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");


                System.out.println();
            }
        }
    }
}
  //      for (int i = 1; i <= 10; i++) {
  //          for (int j = 1; j <=10; j++) {
  //              System.out.print(i*j + " ");
//
  //              }
  //          System.out.println();
  //          }
//
//
  //      }
  //  }
