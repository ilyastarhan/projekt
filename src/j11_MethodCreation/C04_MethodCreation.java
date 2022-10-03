package j11_MethodCreation;

import java.util.Scanner;

public class C04_MethodCreation {
    public static void main(String[] args) {

        String name = "ilyas";
        C04_MethodDepo.gecmeNotu(75);

        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int sayi = scan.nextInt();
        C04_MethodDepo.gecmeNotu(sayi);
        topla(21,140);
        C04_MethodDepo.topla(21,65);

    }
    public static void topla(int a, int b) {
        System.out.println(a + b);

    }
}
