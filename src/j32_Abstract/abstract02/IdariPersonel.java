package j32_Abstract.abstract02;

public class IdariPersonel extends Personel{

    @Override
    void maasHesapla(int yevmiye) {
        super.maas = yevmiye*30;
        System.out.println("maas = " + maas);
    }

    @Override
    public String toString() {
        return "IdariPersonel{" +
                "name='" + name + '\'' +
                ", maas=" + maas +
                '}';
    }

    @Override
    void maasBilgisi() {


    }
}
