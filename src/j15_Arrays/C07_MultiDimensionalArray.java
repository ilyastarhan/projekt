package j15_Arrays;

public class C07_MultiDimensionalArray {
    public static void main(String[] args) {

        int apt [][] = {
                {1, 2, 3},//0
                {10, 20},//1
                {101}//2
        };
        int toplam = 0;
        for (int i = 0; i < apt.length; i++) {
            for (int j = 0; j < apt[i].length; j++){
                    toplam+=apt[i][j];
                }

                }
        System.out.println("toplamlari = " + toplam);
    }

}
