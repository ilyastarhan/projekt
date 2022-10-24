package Homework.ekim23.elektrikHesap;

public class ElektrikHesap {

    int toplamTuketim;
    double oran = 0.7;
    double fatura;


    public void tuketimEkle(int tuketim){
        toplamTuketim+=tuketim;


    }
    public double odenecekTutar(){
        fatura=(toplamTuketim*oran);
        return fatura;



    }



}
