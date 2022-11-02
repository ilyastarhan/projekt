package j25_Encapsulation.encapsulation03;

public class Araba {
    private String model, renk;
    private int motor, yil;

    Araba() {

    }


    Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        setMotor(motor);
        this.renk = renk;
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public String getRenk() {
        return renk;
    }

    public int getMotor() {
        return motor;
    }

    public int getYil() {
        return yil;
    }

    public void setMotor(int motor) {
        if (motor <= 1000) {
            this.motor = 1000;
        } else this.motor = motor;
    }

    public void setYil(int yil) {
        if (yil < 0) {
            this.yil = yil * -1;
        } else
            this.yil = yil;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
