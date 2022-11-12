package j32_Abstract.Ornek5;

public class Lahmacun implements IFood {
    @Override
    public void taste() {
        System.out.println("mükemmel yerli pizza..");
    }

    @Override
    public double ucret() {
        return 2;
    }

    public void dough() {
        System.out.println(" mayalı hamur hazırlandı");
    }

    public void topping() {
        System.out.println("uygun şekilde açıldı...");
    }

    public void bake() {
        System.out.println("özel kıyma kullanıldı..");
    }
}
