package challange.Day10;

public class Q09 {
    public static void main(String[] args) {


        //  Q09_Arrays
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int arr [][] = {{1,3,6},{2,8},{5,7,9,14}};
        int cifttoplam=0;
        int tektoplam=0;
        for(int i=0; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length; j++){
                if(arr[i][j]%2==0) cifttoplam+=arr[i][j];
                else tektoplam+=arr[i][j];
            }
        }
        System.out.println("cifttoplam = " + cifttoplam);
        System.out.println("tektoplam = " + tektoplam);
    }
}
