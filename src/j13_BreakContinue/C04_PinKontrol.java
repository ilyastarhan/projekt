package j13_BreakContinue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {

        String parola = "ilyas2159";
        Scanner scan = new Scanner(System.in);

        int flag = 0;
        for(int i = 0; i < 3; i++) {
            System.out.println("Lütfen pin giriniz: ");
            String pin = scan.next();
            if(pin.equals(parola)){
                System.out.println("sisteme basarili bir sekilde giris yaptiniz...");
                break;
            }
            else {
                System.out.println("hatali giris yaptiniz tekrar deneyiniz...");
                flag++;
                System.out.println("kalan hakkiniz: " + (3-flag));
                if(flag ==3){
                    System.out.println("sistemden cikiliyor");
                }

            }
    }}
}
