package j19_StaticKeyword.Task04;

import java.util.Scanner;

public class Bisiklet {
    int hiz;
    int vites;

    public void hizDegistir(int yeniHiz)
    {
        hiz=yeniHiz;
    }

    public void vitesArtir()
    {
        vites++;

        if (vites > 5)
        {
            System.out.println("vites 5 den büyük olamaz");
            vites =5;
        }
    }

    public void vitesAzalt()
    {
        vites--;

        if (vites < 1)
        {
            System.out.println("vites 1 den küçük olamaz");
            vites =1;
        }
    }

    public void durumYazdir()
    {
        System.out.println("hiz = " + hiz);
        System.out.println("vites = " + vites);
    }

    public static void islemYap(Bisiklet bisiklet, int secim)
    {
        switch (secim){
            case 1:
                System.out.print("Hız Giriniz : ");
                Scanner oku=new Scanner(System.in);
                int yeniHiz=oku.nextInt();
                bisiklet.hizDegistir(yeniHiz);
                break;
            case 2:
                bisiklet.vitesArtir();break;
            case 3:
                bisiklet.vitesAzalt();break;
            case 4:
                bisiklet.durumYazdir();break;
        }
    }

    public static void menuYaz()
    {
        System.out.println("****Bisiklet Kontrol Paneli***");
        System.out.println("1- Yeni Hız Ver");
        System.out.println("2- Vites Yükselt");
        System.out.println("3- Vites Azalt");
        System.out.println("4- Durum Göster");
        System.out.print("Seçiminiz =");
    }

    public static Bisiklet bisikletOlsutur()
    {
        Bisiklet bisiklet=new Bisiklet();
        bisiklet.hiz=0;
        bisiklet.vites=1;

        return bisiklet;
    }
}
