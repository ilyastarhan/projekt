package j25_Encapsulation;

public class Task02 {
    public static void main(String[] args) {


        BMI musteri = new BMI("Ahmet", 25, 1.70, 95);
        System.out.println(musteri.getStatus());
        System.out.println(musteri.getBMI());
    }
}