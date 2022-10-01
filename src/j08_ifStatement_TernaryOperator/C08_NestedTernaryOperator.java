package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

            /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen miktar giriniz: ");
        int miktar = scan.nextInt();
        System.out.print("Lütfen birim fiyat giriniz: ");
        double fiyat = scan.nextDouble();
        System.out.println("Fatura" + (miktar > 100 ? ("Ödenecek Tutar " + (miktar * fiyat * 0.67)) : fiyat * miktar));
        double fatura = miktar > 100 ? (miktar * fiyat * 0.67) : fiyat*miktar;
        System.out.println("fatura = " + fatura);


    }
}
