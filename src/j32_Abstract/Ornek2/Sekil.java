package j32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    }

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    @Override
    public String toString() {
        return "ismi =" + this.name +
                "\n Alan = " + this.alan() +
                "\n Cevre = " + this.cevre();
    }

    public void ciz() {
        System.out.println(this.name + "çizildi...");
    }
}
