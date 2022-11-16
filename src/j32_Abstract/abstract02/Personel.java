package j32_Abstract.abstract02;

public abstract class Personel {
    String name;
    int maas;



    abstract void maasHesapla(int yevmiye);
    abstract void maasBilgisi();
    public void sigorta(){
        System.out.println("Agam özel sigorta kapsaminda indirimli muayene olabilirsin");
    }
}
