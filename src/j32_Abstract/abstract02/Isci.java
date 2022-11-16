package j32_Abstract.abstract02;

public class Isci extends Personel{

    @Override
    void maasHesapla(int yevmiye) {
        super.maas = yevmiye*26;
        System.out.println("maas = " + maas);


    }

    @Override
    void maasBilgisi() {

    }

    @Override
    public String toString() {
        return "Isci{" +
                "name='" + name + '\'' +
                ", maas=" + maas +
                '}';
    }
}
