package interview;

public class T1 {
    public static void main(String[] args) {
        int x = 20;
        int y = 34;

        x = x + y; // x = 54
        y = x - y; // y = 20
        x = x - y; // x = 34
        System.out.println(x);

    }
}
