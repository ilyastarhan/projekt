package j10_StringManipulations;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {
        /*
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String str = "Istanbul";
        System.out.println(str.startsWith("Is"));//true
        System.out.println(str.endsWith("bula"));//false
        System.out.println(str.startsWith("a", 3));//true

        String str1 = "bul";
        System.out.println(str.endsWith(str1));//true
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email adresini giriniz");
        String email = scan.nextLine();
        if (email.contains("@gmail.com")) {
            if (email.endsWith("@gmail.com")) {
                System.out.println("Hesabiniz onaylandi");
            } else  {
                System.out.println("Lütfen gmail hesabi giriniz...");
            }
        } else {
            System.out.println("lütfen gecerli bir hesap giriniz: ");
        }


    }
}
