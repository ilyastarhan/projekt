package j29_Exceptions;

public class kaptan {
    public static void main(String[] args) {
        int[] arr = {32, 41, 56, 78, 80, 85, 87, 91, 95, 96};
        int peak = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peak = arr[i];
            }
        }
        if (peak != 0) {
            System.out.println("peak = " + peak);
        } else System.out.println("there is no peak number");

    }
}