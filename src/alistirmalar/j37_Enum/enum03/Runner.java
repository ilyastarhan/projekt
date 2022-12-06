package alistirmalar.j37_Enum.enum03;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap();
        Kitap kitap2 = new Kitap();
        Kitap kitap3 = new Kitap();
        kitap1.name="Isimle Ates Arasinda";
        kitap1.kategori=KitapKategori.ROMAN;
        kitap2.name = "Yusuf ile Züleyha";
        kitap2.kategori=KitapKategori.HIKAYE;
        kitap3.name="Nar Agaci";
        kitap3.kategori=KitapKategori.ROMAN;
        List<Kitap> kutuphane = new ArrayList<Kitap>();
        kutuphane.add(kitap1);
        kutuphane.add(kitap2);
        kutuphane.add(kitap3);
        for(Kitap k : kutuphane){
            if(k.kategori==KitapKategori.ROMAN){
                System.out.println(k.name);
            }
        }


    }
}
