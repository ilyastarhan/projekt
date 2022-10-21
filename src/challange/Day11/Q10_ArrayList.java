package challange.Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10_ArrayList {
    public static void main(String[] args) {


     /*
		A list has elements “H”, “G” and “E”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
        */
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("H", "G", "E"));
        System.out.println("Lütfen bir harf giriniz");
        char letter = scan.next().toUpperCase().charAt(0);
        if(list.contains(String.valueOf(letter))) {
            list.set(list.indexOf(String.valueOf(letter)), "Got it");
        }
        else list.add(String.valueOf(letter));
        System.out.println("list = " + list);


    }
}
