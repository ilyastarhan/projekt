package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {

        //Task-> sayi arrayindaki en büyük elemani kod eden orint yaziniz:

        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j] > max) {
                    max = sayi[i][j];
                }
            }
        }
        System.out.println("max = " + max);


    }
}
