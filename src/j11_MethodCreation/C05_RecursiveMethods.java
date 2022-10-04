package j11_MethodCreation;

import java.util.Scanner;

public class C05_RecursiveMethods {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
/*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

        /*Faktoriyel
         */

        System.out.println("Lütfen faktoriyel almak istediginiz sayiyi giriniz: ");
        int num = scan.nextInt();
        System.out.println(faktoriyel(num));

    }

    private static int faktoriyel(int sayi) {

        if (sayi >= 1)
            return sayi * faktoriyel(sayi - 1);
        else
            return 1;
    }
}
