package j32_Abstract.Ornek2;

public class Cember extends Sekil {

    private double yariCap;
    private final double PI = 3.14;

    public Cember(double yariCap) {
        setYariCap(yariCap);
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double alan() {
        return PI * this.yariCap * this.yariCap;
    }

    @Override
    public double cevre() {
        return 2*PI * yariCap;
    }
}
