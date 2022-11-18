package j32_Abstract.kaptan;

public class Mercedes extends Car implements AutoPark{


    public Mercedes(String make, String model, int year, int price, String color) throws Exception {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    void start() {

    }

    @Override
    void drive() {

    }
}
