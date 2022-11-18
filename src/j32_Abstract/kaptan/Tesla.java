package j32_Abstract.kaptan;

public class Tesla extends Car implements AutoPark, AutoPilot{


    public Tesla(String make, String model, int year, int price, String color) throws Exception {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    void start() {

    }

    @Override
    void drive() {

    }
}
