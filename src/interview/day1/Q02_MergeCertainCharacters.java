package interview.day1;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Enter a number you want to repeat first index of and last index of the string: ");
        int repeatNum = scan.nextInt();
        System.out.println(repeat(str, repeatNum));

    }
    public static String repeat(String str, int repeatNum) {
        String newStr = "";
        for(int i = 0; i < repeatNum; i++){
            newStr+="" + str.charAt(0) + str.charAt(str.length()-1);

        }
        return newStr;
    }

}
