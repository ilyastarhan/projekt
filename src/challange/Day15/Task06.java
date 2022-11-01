package challange.Day15;

public class Task06 {
    public static void main(String[] args) {


        System.out.println(multiply(12, 5, 7, 8, 9));

    }

    private static double multiply(double... num) {
        int multiplication = 1;
        for (double value : num) {
            multiplication *= value;
        }
        return multiplication;
    }
}
