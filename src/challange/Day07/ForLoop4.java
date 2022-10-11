package challange.Day07;

import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {
        /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
   ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
   hesaplayan kodu yazın
  Örnek Ekran Çıktısı
  Girilen sayı=4
  Kareler toplamı=14
   */
        Scanner scan = new Scanner(System.in);
        System.out.print("1'den büyük bir tam sayi giriniz: ");
        int num = scan.nextInt();
        int toplam = 0;
        for(int i = 1; i < num; i++){
            toplam+=i*i;

        }
        System.out.println("kareler toplami = " + toplam);
    }
}
