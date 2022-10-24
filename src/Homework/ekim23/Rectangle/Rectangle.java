package Homework.ekim23.Rectangle;

public class Rectangle {
    double width;
    double length;

    Rectangle(){};
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public void alanHesapla(){
        double alan = width *length;
        System.out.println("Dikdörtgenin alani = " + alan);
    }
    public void cevre(){
        double cevre = 2*(width + length);
        System.out.println("Dikdortgenin cevresi = " + cevre);

    }
}

