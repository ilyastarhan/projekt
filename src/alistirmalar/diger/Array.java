package alistirmalar.diger;

public class Array {
    public static void main(String[] args) {
        int[] sayilar =  {1,2,3};
        int[][] sayilar1 = new int [2][3];
        int [][][] sayilar2 = new int [2][3][4];
        sayilar1[0][0] = 15;
        sayilar1[0][1] = 22;
        sayilar1[0][2] = 15;
        sayilar1[1][0] = 15;
        sayilar1[1][1] = 15;
        sayilar1[1][2] = 15;
        sayilar2[0][1][3] = 15;

        System.out.println(sayilar1[0][1]);

    }
}
