package challange.Day04;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime girinit");
        String s1 = scan.next().toLowerCase();

        if (s1.startsWith("gh")) {
            System.out.println(s1);
        }
        else if(s1.startsWith("g")){
            System.out.println(s1.charAt(0) + s1.substring(2));
        }
        else if(s1.charAt(1)=='h'){
            System.out.println(s1.charAt(1) + s1.substring(2));
        }
        else

        System.out.println(s1.substring(2));
}
}
