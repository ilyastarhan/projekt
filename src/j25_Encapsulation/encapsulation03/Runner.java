package j25_Encapsulation.encapsulation03;

public class Runner {
    public static void main(String[] args) {

        Araba araba1 = new Araba();
        araba1.setMotor(1600);
        araba1.setRenk("Mavi");
        araba1.setModel("Volkswagen");
        araba1.setYil(2015);
        Araba araba2 = new Araba("Toyota", "Siyah", 800, -2017);
        Araba araba3 = new Araba("BMW", "Kirmizi", 2000,2018);
        araba2.setMotor(800);
        araba2.setYil(-2000);

        System.out.println("araba1 = " + araba1);
        System.out.println("araba2 = " + araba2);
        System.out.println("araba3 = " + araba3);

    }
}
