package challange;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Rastgele {
    public static void main(String[] args) {


        System.out.println(ciftSayilarinCarpimi());

    }

    private static int ciftSayilarinCarpimi() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Listenin uzunlugunu giriniz: ");
        int listSize = scan.nextInt();
        int carpim = 1;
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            liste.add(rand.nextInt(100));
            if (liste.get(i) % 2 == 0) {
                carpim *= liste.get(i);
            }
        }
        System.out.println("Random olusturulan listeniz: " + liste);
        System.out.print("Cift sayilarin carpimlari = ");
        return carpim;
    }
}
