package alistirmalar.NestedLoops;

public class Q01 {
    public static void main(String[] args) {


        for(int i = 0; i<5 ; i++){
            for(int j = 0; j<4 ; j++){
                for(int k = 0; k<2; k++){
                    System.out.println(i + " " + j + " " + k);
                    if(j==3){
                        break;
                    }
                }

            }
        }





    }
}
