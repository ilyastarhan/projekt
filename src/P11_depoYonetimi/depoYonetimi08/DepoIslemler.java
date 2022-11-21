package P11_depoYonetimi.depoYonetimi08;

import java.util.Map;
import java.util.Scanner;

public class DepoIslemler {

    //Projenin önceki versiyonunda işlemler buradaydı. Yazılmış kodlarda kullanıldığı için yeni baştan uğraşmamak için buradaki değişkenler kaldırılmadı.
    static int urunID = 1000; //Map için
    static Scanner scan = new Scanner(System.in);

    static double kasaDurum=0.0;
   static double karlılık=0.0;
    static double gelir=0.0;
   static double gider=0.0;

    public static void main(String[] args) {
        kasaDurum=gelir-gider;
        karlılık= kasaDurum*100/gider;

        System.out.println(gelir);
        System.out.println(gider);
        System.out.println(kasaDurum);
    }

    }

