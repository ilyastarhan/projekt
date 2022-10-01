package Homework.eylul14;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */
        Scanner scan = new Scanner(System.in);
        boolean hesap;
        System.out.print("Bir banka Hesabiniz var mi? Evet icin \"True\" Hayir icin \"False\" yaziniz:");
        hesap = scan.nextBoolean();
        System.out.println(hesap);


    }
}
