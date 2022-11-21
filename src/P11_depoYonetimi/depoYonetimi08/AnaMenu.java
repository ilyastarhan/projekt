package P11_depoYonetimi.depoYonetimi08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class AnaMenu extends JFrame {

    //Ana menudeki bütün işlemler buraya alındı.


    DepoIslemler obje=new DepoIslemler();



    private JButton urunCikisiButton;
    private JButton cikisButton;
    private JButton urunGirisiButton;
    private JButton urunRafaKoymaButton1;
    private JButton urunTanimlamaButton;
    private JButton urunListelemeButton;
    private JPanel menu;

    public AnaMenu(){

        add(menu);

        setSize(400,400);
        setTitle("Ana Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        urunTanimlamaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 /* Urunler classı oluşturuldu. isim, üretici,birim,miktar,raf parametreli bir cons. create edildi ve Urunler data type'lı objeler bir listeye atandı.
        Urunler Class'ında create edilen  "static Map<Integer,Urunler> urunListesiMap = new HashMap<>()" mapine dinamik olarak her yeni ürün ile değişen
         Integer tipi UrunId ve Urunler data type'ına sahip objeler atandı.

         *Tasklerde bir ürünün tamamen kaldırılması yer almadığı için UrunID için farklı çalışmalar yapılmadı.

         *Daha sonra işleme konu olacak miktar ve raf için default değerler atandı.

         */
                System.out.println("urunun ismini giriniz");
                String urunIsmi = obje.scan.nextLine();
                System.out.println("urunun Ureticisini giriniz");
                String urunUretici = obje.scan.nextLine();
                System.out.println("urunun Birimini giriniz");
                String urunBirim = obje.scan.nextLine();

                Urunler obje = new Urunler(urunIsmi, urunUretici, 0, urunBirim, "Rafı belli değil",0.0,0.0);
                Urunler.urunListesiMap.put(DepoIslemler.urunID, obje);
            }
        });
        urunListelemeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Urun ID 'e bağlı şekilde printf ile düzenlenerek ürünler listesi oluşturuldu.

                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s            %-20s %-10s\n", "Urun ID", "Urun Ismi", "Uretici", "Miktar", "Birim", "Raf","maliyet","fiyat");
                System.out.println("==========================================================================================================");

                for (Map.Entry<Integer, Urunler> w : Urunler.urunListesiMap.entrySet()) {
                    System.out.printf("%-10d %-10s %-10s %-10d %-10s %-10s       %-20.1f %-10.1f \n", w.getKey(), w.getValue().getIsim(), w.getValue().getUretici(), w.getValue().getMiktar(), w.getValue().getBirim(), w.getValue().getRaf(),w.getValue().getMaliyet(),w.getValue().getFiyat());
                }
            }
        });
        urunGirisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ID üzerinden urun girişi yapılması için method oluşturuldu. ID'nin hatırlanması sorun olmaması için Methodun başına ürünler ve ID'leri hatırlatma
                // olarak eklendi. Scannerdan alınan ID ve miktar değişkenleri try-Catch methodu ile kontrol edildi.
                //Tercih'in exception'a yol açmamas için kontrol yapıldı.

                System.out.printf("%-10s %-10s\n", "Urun ID", "Urun Ismi");
                System.out.println("======================");

                for (Map.Entry<Integer, Urunler> w : Urunler.urunListesiMap.entrySet()) {
                    System.out.printf("%-10d %-10s \n", w.getKey(), w.getValue().getIsim());}


                System.out.println("lütfen ürün ID si giriniz");
                int urunID = TryCatches.tryCatchesID();
                if (Urunler.urunListesiMap.containsKey(urunID)) {
                    System.out.println("lütfen eklemek istediğiniz miktarı giriniz");
                    int miktar = TryCatches.tryCatchesInt();
                    Urunler.urunListesiMap.get(urunID).setMiktar(Urunler.urunListesiMap.get(urunID).getMiktar() + miktar);
                    System.out.println("lütfen ürünün birim maliyetini giriniz");
                    double maliyet = TryCatches.tryCatchesDouble();
                    Urunler.urunListesiMap.get(urunID).setMaliyet(maliyet);
                    boolean muhasebe=true;

                    muhasebe(muhasebe,maliyet,miktar);






                }

                }

        });
        urunCikisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /* ID üzerinden urun çıkışı yapılabilmesi için method oluşturuldu. ID'nin hatırlanması sorun olmaması için Methodun başına ürünler ve ID'leri
         hatırlatma olarak eklendi. Scannerdan alınan ID ve miktar değişkenleri try-Catch methodu ile kontrol edildi.
          * Tercih'in exception'a yol açmaması için kontrol yapıldı.
           *Depoda olandan fazla ürünün çıkışı istenememesi ve diğer exeptionlar için miktar değişkenine özel bir method create edildi..
         */
                System.out.printf("%-10s %-10s\n", "Urun ID", "Urun Ismi");
                System.out.println("======================");

                for (Map.Entry<Integer, Urunler> w : Urunler.urunListesiMap.entrySet()) {
                    System.out.printf("%-10d %-10s \n", w.getKey(), w.getValue().getIsim());
                }
                System.out.println("lütfen ürün ID si giriniz");
                int urunID = TryCatches.tryCatchesID();
                if (Urunler.urunListesiMap.containsKey(urunID)) {
                    System.out.println("lütfen çıkarmak istediğiniz miktarı giriniz");

                    int miktar = TryCatches.tryCatchesMiktar();
                    if (miktar > Urunler.urunListesiMap.get(urunID).getMiktar()) {
                        System.out.println("depoda yeterli miktarda ürün yok");
                    } else {
                        Urunler.urunListesiMap.get(urunID).setMiktar(Urunler.urunListesiMap.get(urunID).getMiktar() - miktar);}
                    System.out.println("lütfen ürünün birim fiyatını giriniz");
                    double fiyat = TryCatches.tryCatchesDouble();
                    Urunler.urunListesiMap.get(urunID).setFiyat(fiyat);
                    boolean muhasebe=false;

                    muhasebe(muhasebe,fiyat,miktar);  }

            }
        });
        urunRafaKoymaButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  /* ID üzerinden urun raf seçimi yapılabilmesi için method oluşturuldu. ID'nin hatırlanması sorun olmaması için Methodun başına ürünler ve ID'leri
         hatırlatma olarak eklendi. Scannerdan alınan ID ve miktar değişkenleri try-Catch methodu ile kontrol edildi. Kullanıcının hatırlayamama dışında
          hatalı girişleri için ana menu, tekrar deneme ve çıkış seçenekleri sunuldu. Tercih'in exception'a yol açmaması için kontrol yapıldı.
         */
                System.out.printf("%-10s %-10s\n", "Urun ID", "Urun Ismi");
                System.out.println("======================");

                for (Map.Entry<Integer, Urunler> w : Urunler.urunListesiMap.entrySet()) {
                    System.out.printf("%-10d %-10s \n", w.getKey(), w.getValue().getIsim());
                }
                System.out.println("lütfen ürün ID si giriniz");
                int urunID = TryCatches.tryCatchesID();
                if (Urunler.urunListesiMap.containsKey(urunID)) {
                    System.out.println("lütfen raf bilgisi giriniz");
                    String urunRaf = DepoIslemler.scan.next();
                    Urunler.urunListesiMap.get(urunID).setRaf(urunRaf);


                } else {   System.out.println("ID kayıtlı değildir. hatalı işlem yaptınız.");

                }
            }
        });
        cikisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Kasa Durumu: "+ DepoIslemler.kasaDurum);
                System.out.println("Karlılık: "+ DepoIslemler.karlılık);

            }
        });
    }

    private static void muhasebe(boolean muhasebe, double maliyet, int miktar) {

        if(muhasebe){

            DepoIslemler.gider+=miktar*maliyet;


        }else {
            DepoIslemler.gelir+=maliyet*miktar;}//Kod uzamasın diye maliyet parametresini kullanıyorum fakat ürün çıkışı methodundan aldığım aslında fiyat


        DepoIslemler.kasaDurum= DepoIslemler.gelir- DepoIslemler.gider;
        DepoIslemler.karlılık= DepoIslemler.kasaDurum*100/ DepoIslemler.gider;




    }
}
