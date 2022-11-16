package j32_Abstract.abstract02;

public class Runner {

    public static void main(String[] args) {

        Isci isci1 = new Isci();
        isci1.name = "ahmet";
        isci1.maasHesapla(200);
        IdariPersonel idariPerson1 = new IdariPersonel();
        idariPerson1.name = "Selim";
        idariPerson1.maasHesapla(150);
        System.out.println(idariPerson1.toString());
    }
}
