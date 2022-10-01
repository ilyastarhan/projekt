package challange.Day2;

public class Q01_Modulus {
    public static void main(String[] args) {
        int i = 12345;
        int birler = i % 10;
        int onlar = (i / 10) % 10;
        int yuzler = (i / 100) % 10;
        int binler = (i / 1000) % 10;
        int onbinler = (i / 10000);
        System.out.println(birler+ "\n"+onlar+ "\n" +yuzler + "\n" +binler+ "\n" + onbinler);

    }
}
