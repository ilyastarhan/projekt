package j15_Arrays;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};

        int yeniArr[]= new int [sayi.length];
        for (int i=0;i< sayi.length;i++){
            for (int j=0;j<sayi[i].length;j++)
            {
                yeniArr[i]+=sayi[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniArr));

    }
}
