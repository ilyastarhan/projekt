package challange.Day03;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yasinizi giriniz: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("Yasiniz oy kullanmaya uygun");
            if (age >= 70) {
                System.out.println("Üc kez oy kullanabilirsiniz...");
            } else if (age >= 50) {
                System.out.println("Iki kez oy kullanabilirsiniz...");
            } else {
                System.out.println("Bir kez oy kullanabilirsiniz...");
            }
        } else
            System.out.println("Oy kullanamazsiniz...");
    }
}
