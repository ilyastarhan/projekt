package j19_StaticKeyword.Task02;

public class Runner {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */


    public static void main(String[] args) {
        Musteri musteri= new Musteri();

        musteri.name = "Necdet";

       ElektrikHesabi hesap=new ElektrikHesabi();

        musteri.elektrikHesabi=hesap;

        musteri.elektrikHesabi.tuketimEkle(100);
        musteri.elektrikHesabi.tuketimEkle(150);

        System.out.println("toplam tüketim = " + musteri.elektrikHesabi.toplamTuketim);

        System.out.println("ödenecek tutar = " + musteri.elektrikHesabi.odenecekTutar());//2.Yöntem
        System.out.println("ödenecek tutar (2) = " + musteri.elektrikHesabi.fatura);//1.Yöntem


    }


}
