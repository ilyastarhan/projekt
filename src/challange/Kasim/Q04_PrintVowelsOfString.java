package challange.Kasim;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {

    //Get String from user and print just vowels(aeiou) inside String on the console
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine().toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c== 'a' ||  c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
                System.out.print(c + " ");
        }
        System.out.println();
        //2.yol
        System.out.println(str.replaceAll("[^aeiou]", ""));

    }
}
