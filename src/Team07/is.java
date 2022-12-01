package Team07;

public class is {


    public static void main(String[] args) {
        int[][] arr = {{2, 7, 6}, {9, 5, 1}, {4, 1, 8}};

        System.out.println(isMagicSquare(arr));

    }

    public static boolean isMagicSquare(int[][] a) {
        boolean isMagicSquare = true;
        int temp = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 = 0;
            temp = 0;
            sum2 = 0;
            sum3 = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a.length != a[j].length) {
                    isMagicSquare = false;
                    break;
                } else {
                    sum1 += a[i][j];
                    sum2 += a[j][j];
                    temp += a[j][i];
                    sum3 += a[a.length - 1 - j][j];
                }

            }
            if (sum1 != sum2 && sum1 != sum3 && sum1 != temp) {
                isMagicSquare = false;
                break;
            }

        }
        return isMagicSquare;
    }
}
