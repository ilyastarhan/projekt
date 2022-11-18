package j32_Abstract.kaptan;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable{


    public CydeoCar(String make, String model, int year, int price, String color) throws Exception {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void fly() {

    }

    @Override
    void start() {

    }

    @Override
    void drive() {

    }
}
