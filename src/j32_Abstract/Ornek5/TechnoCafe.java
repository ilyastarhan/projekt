package j32_Abstract.Ornek5;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        ArrayList<IFood> siparis = new ArrayList<>();
        Scanner oku = new Scanner(System.in);

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    AdanaKebap ak = new AdanaKebap();
                    siparis.add(ak);
                    break;

                case 2:
                    Lahmacun l = new Lahmacun();
                    siparis.add(l);
                    break;

                case 3:
                    Borsh b = new Borsh();
                    siparis.add(b);
                    break;

                case 4:
                    Palov p = new Palov();
                    siparis.add(p);
                    break;
                default:
                    if (secim != 5)
                        System.out.println("Yanlis giris yaptiniz");
            }
        } while (secim != 0);

        System.out.println("Alınan Siparişler\n");
        for (IFood yemek : siparis) {
            System.out.println(yemek.getClass().getSimpleName() + "\n");
        }
        System.out.println();


        double toplamUcret = 0;
        for (IFood yemek : siparis) {
            TechnoKitchen.Pisir(yemek);
            toplamUcret += yemek.ucret();
        }

        System.out.println("Toplam ücret=" + toplamUcret);

    }


    public static void menu() {
        System.out.println("*********** Menu ************");
        System.out.println("1. Adana Kebap (15)\n2. Lahmacun (5)\n3. " +
                "Borsh (8)\n4. Palov (10)\n0. Tamam");
    }


}