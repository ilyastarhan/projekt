package j09_Switch_Statement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

        TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 0:
                System.out.println("Sifir");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Üc");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("yanlis tusa bastiniz..");

        }

    }
}