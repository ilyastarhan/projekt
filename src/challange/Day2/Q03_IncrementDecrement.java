package challange.Day2;

public class Q03_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("*****Arttirma*****");
        int i = 1;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);

        System.out.println("*****Azaltma*****");
        int b= 5;
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        System.out.println("----Soru1----");
        int x = 20;
        int y = 15;
        System.out.println(++x + y--);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        System.out.println("----Soru2----");
        int k = 5;
        System.out.println(++k + k++ + k++ + --k + k + k-- + k);

    }
}
