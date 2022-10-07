package Homework.ekim06;

public class Task11_Nested {
    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri

        */
        int harf=65;
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(harf+j)+" ");

            }
            System.out.println();//dumy
        }

    }
}
