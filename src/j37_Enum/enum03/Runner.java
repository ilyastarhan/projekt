package j37_Enum.enum03;

import java.util.ArrayList;

public class Runner {
    /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.

*/
    public static void main(String[] args) {
        Kitap ktp1 = new Kitap();
        ktp1.name = "leyla mecnunun nesi oluyor?";
       // ktp1.kategori = "Roman";
        ktp1.kategori=KitapKategori.ROMAN;

        Kitap ktp2 = new Kitap();
        ktp2.name = "agama benden küşleme";
      //  ktp2.kategori = "roman";
        ktp2.kategori=KitapKategori.ROMAN;

        Kitap ktp3 = new Kitap();
        ktp3.name = "halukca ebik gabık";
      //  ktp3.kategori = "Rooman";
        ktp3.kategori=KitapKategori.ROMAN;
        ArrayList<Kitap>kutuphane=new ArrayList<>();

        kutuphane.add(ktp1);
        kutuphane.add(ktp2);
        kutuphane.add(ktp3);

      //  for (Kitap k:kutuphane){
      //      if (k.kategori.equalsIgnoreCase("roman"))
      //          System.out.println(k.name);
      //  }
        for (Kitap k:kutuphane){
            if (k.kategori==KitapKategori.ROMAN)
                System.out.println(k.name);
        }


    }
}
