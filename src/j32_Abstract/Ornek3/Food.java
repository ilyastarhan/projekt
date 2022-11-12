package j32_Abstract.Ornek3;

public abstract class Food {
    private String name;

    public abstract void madeIn();

    public abstract void taste();

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }
}
