package j17_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int arr[] [] = {{2,3}, {4}, {5,6,7}};
        int carpim = 1;
        for(int[] each: arr){
            for(int each1:each){
                carpim*=each1;
            }

        }
        System.out.println("carpim = " + carpim);

    }
}
