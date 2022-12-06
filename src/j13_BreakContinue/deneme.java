package j13_BreakContinue;

public class deneme {

    public static void main(String[] args) {


        for(int i = 0; i<5; i++ ){
            for(int j = 0; j<5; j++ ){

                if(i==1)
                    break;
                System.out.print(i+ "" +j + " ");
            }

        }
    }
}
