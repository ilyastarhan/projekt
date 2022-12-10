package j19_StaticKeyword;

/*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
       4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
        */
public class C02_StaticBlock {
    static String isim = "sefil haluk";//gns -> static var.

    static {//ilk çalışacak static block
        System.out.println("isim = " + isim);//sefil haluk
        System.out.println("agam 2. static block çalıştı :) ");
        isim = "UGUR JavaCAN";
      System.out.println("isim = " + isim);//UGUR JavaCAN

    }

    static {//2. çalışacak static block
        System.out.println("agam 1. static block çalıştı :) ");
        isim = "Dilek Hanım";
        System.out.println("isim = " + isim);//Dilek Hanım

    }

    public static void main(String[] args) {//main bası
        System.out.println("main method başladı :) ");
       isim = "Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti :( ");//Kerim Bey
    }//main sonu


}
