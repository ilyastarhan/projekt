package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String tersstr="";
        String str = scan.nextLine();
        for(int i= 0; i<str.length(); i++) {
            tersstr += str.charAt((str.length() - 1)-i);
            }
         if(str.equalsIgnoreCase(tersstr)){
             System.out.println("kelime polidromdur");
         }
         else System.out.println("polidrom degildir");


    }
}



