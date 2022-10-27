package challange.Day13.MaasHesaplama;

public class Runner {
    public static void main(String[] args) {


        Employee isci1 = new Employee("Ahmet", 15000, 50, 1997);
        System.out.println("isci1 = " + isci1);
        System.out.println(isci1.tax());
        System.out.println(isci1.bonus());
        System.out.println(isci1.maasArtis());

    }
}