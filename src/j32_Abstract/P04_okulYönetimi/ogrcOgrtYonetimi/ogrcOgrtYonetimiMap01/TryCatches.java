package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap01;

import java.util.Scanner;

public class TryCatches {

    public static int integerGiris() {
        Scanner scan =new Scanner(System.in);
        int giris =0;
        boolean flag=false;

        do {
            System.out.println("lütfen giriş yapınız");
            if (flag==true){
                scan.nextLine();
                flag=false;
            }                                     //ctrl +alt +t
            try {
                giris =scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız");
                flag =true;
                integerGiris();

            }
        }while(flag);


        return giris;
    }
}
