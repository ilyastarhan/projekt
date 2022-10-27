package Homework.ekim23.elektrikHesap;

public class ElektrikHesapRunner {
    public static void main(String[] args) {
        ElektrikHesap fatura1 = new ElektrikHesap();
        fatura1.tuketimEkle(500);
        fatura1.tuketimEkle(300);
        System.out.println(fatura1.toplamTuketim);
        System.out.println(fatura1.odenecekTutar());


        Musteri musteri1 = new Musteri("Ahmet", fatura1);
        System.out.println(musteri1.ElektrikHesap);


    }

}
