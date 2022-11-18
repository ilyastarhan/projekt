package j32_Abstract.kaptan;

public abstract class Car {
    private String make;
    private String model;
    private int year;
    private int price;
    private String color;

    abstract void start();
    abstract void drive();

    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(String make, String model, int year, int price, String color) throws Exception {
        if (make.length() == 0)
            throw new Exception("Make can not be empty");
        else
            this.make = make;
        if (model.length() == 0)
            throw new Exception("Model can not be empty");
        else
            this.model = model;
        if (year < 1886)
            throw new Exception("Year is invalid");
        else
            this.year = year;
        if (price < 0)
            throw new Exception("Price must be over 0");
        else
            this.price = price;
        if (color.length() == 0)
            throw new Exception("Color can not be empty");
        else
            this.color = color;
    }

    public void setMake(String make) throws Exception {
        if (make.length() == 0)
            throw new Exception("Make can not be empty");
        else
            this.make = make;
    }

    public void setYear(int year) throws Exception {
        if (year < 1886)
            throw new Exception("Year is invalid");
        else
            this.year = year;
    }

    public final void setModel(String model) throws Exception {
        if (model.length() == 0)
            throw new Exception("Model can not be empty");
        else
            this.model = model;
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws Exception {
        if (price < 0)
            throw new Exception("Price must be over 0");
        else
            this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws Exception {
        if (color.length() == 0 || color == null)
            throw new Exception("Color can not be empty");
        else
            this.color = color;
    }
}
