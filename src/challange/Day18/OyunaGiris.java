package challange.Day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunaGiris {
    static  List<Integer> paraListesi=new ArrayList<>();
    static Kutular kutular=new Kutular();
    static Scanner sc=new Scanner(System.in);
    static int kutuNumaram, kutumdakiPara;

    public static void main(String[] args) {

        paraListesi.add(1);
        paraListesi.add(10);
        paraListesi.add(500);
        paraListesi.add(1000);
        paraListesi.add(5000);
        paraListesi.add(10000);
        paraListesi.add(50000);
        paraListesi.add(100000);
        paraListesi.add(250000);
        paraListesi.add(500000);
        Collections.shuffle(paraListesi);

        kutularıOlustur();

        System.out.println("YARIŞMAMIZA HOŞ GELDİNİZ");
        System.out.println("Lütfen kutunuzu seçiniz");
        kutuNumaram=sc.nextInt();
        kutumdakiPara=paraListesi.get(kutuNumaram-1);
        System.out.println("Kutu numaranız :"+kutuNumaram);

        kutular.kendiKutumuKaldir(kutuNumaram);

        kutuSecmeActirma();

    }
    private static void kutuSecmeActirma() {
        System.out.println("\nKalan Kutular :"+ kutular.acilmamisKutulariGoster());
        System.out.println("\nHangi kutuyu açtırmak istersiniz?");
        int secim=sc.nextInt();
        kutular.kutuActir(secim);

        if(kutular.kalanKutuSayisiniAl()==7 || kutular.kalanKutuSayisiniAl()==4 ||
                kutular.kalanKutuSayisiniAl()==1){
            System.out.println("Teklif : "+kutular.teklifAl());
            System.out.println("Kabul ediyor musunuz? \n1-Evet \n2-Hayır ");
            int kabul=sc.nextInt();
            if(kabul==1){
                System.out.println("Oyun bitti. Kazandığın Tutar :"+kutular.teklifAl());
                System.out.println("Kutunda da "+kutumdakiPara+" TL vardı");
            }else
                kutuSecmeActirma();
        }else {
            if(kutular.kalanKutuSayisiniAl()>0){
                kutuSecmeActirma();
            }else {
                System.out.println("Oyun bitti. \n Kutundaki Para : "+kutumdakiPara);
            }
        }

    }

    private static void kutularıOlustur() {
        for(int i=0; i<10 ; i++){
            Kutu kutu=new Kutu();
            kutu.setKutuNumarasi(i+1); // 1 .... 9 10
            kutu.setParaMiktari(paraListesi.get(i));
            kutular.kutuEkle(kutu);
            //System.out.println("Kutu No : "+(i+1)+" Para Miktarı :"+paraListesi.get(i));
        }

    }
}
