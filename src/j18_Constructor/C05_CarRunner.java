package j18_Constructor;

public class C05_CarRunner {
    public static void main(String[] args) {



        C05_Car car1 = new C05_Car(210);
        System.out.println("car1.maxHiz = " + car1.maxHiz);

        C05_Car car2 = new C05_Car(210, "volvo");

    }
}
