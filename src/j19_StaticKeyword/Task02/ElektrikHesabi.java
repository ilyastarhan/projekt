package j19_StaticKeyword.Task02;

public class ElektrikHesabi {
    int toplamTuketim=0;
    double oran=0.7;
    double fatura;

    public void tuketimEkle(int tuketim)
    {
        toplamTuketim += tuketim;
    }

    public double odenecekTutar()
    {
        fatura = (oran*toplamTuketim);
        return fatura;
    }

}
