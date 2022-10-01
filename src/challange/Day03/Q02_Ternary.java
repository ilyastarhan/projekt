package challange.Day03;

import java.util.Scanner;

public class Q02_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        double fiyat;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen ürünün fiyatini giriniz: ");
        fiyat = scan.nextDouble();
        String result = fiyat < 10 ? "Ucuz" : (fiyat < 20 ? "Normal" : "Pahali");
        System.out.println(result);
    }
}
