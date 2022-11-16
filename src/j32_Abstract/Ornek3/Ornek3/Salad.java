package j32_Abstract.Ornek3.Ornek3;

public abstract class Salad extends Food {

    abstract void madeIn();

    @Override
    void taste(){
        System.out.println("Salata gavurdagi");
    };
}
