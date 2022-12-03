package Team07.p6_Loops.break_Continue;

public class Break {


    public static void main(String[] args) {

        int a = 35;

        for(int i=1; i<a; i++) {
            System.out.println(i + ". kayit");
            if(i == 15) {
                break;
            }
        }



        int b = 35;
        int count = 1;
        while(b >= 0) {
            System.out.println(count + ". kayit");
            if(count == 15) {
                break;
            }
            count++;
            b--;
        }
    }



}




