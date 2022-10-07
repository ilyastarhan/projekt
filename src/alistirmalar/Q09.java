package alistirmalar;

public class Q09 {
    public static void main(String[] args) {


    /*Number Pattern 1
12345
1234
123
12
1
*/

        for (int i = 0; i<5; i++) {
            for(int j = 1; j<6-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}