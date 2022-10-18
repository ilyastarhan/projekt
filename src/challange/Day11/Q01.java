package challange.Day11;

public class Q01 {
    public static void main(String[] args) {
        //Type a method to check if an int Array is symmetrical or not.
        int arr[] = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        System.out.println(symmetrical(arr));
    }

    private static boolean symmetrical(int arr[]) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (arr[arr.length - 1 - i])) ;
            result = true;
        }
        return result;
    }
}
