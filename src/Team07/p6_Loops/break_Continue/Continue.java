package Team07.p6_Loops.break_Continue;

public class Continue {
    public static void main(String[] args) {


        int a = 15;
        for (int i = 1; i <= a; i++) {
            if (i == 5 || i == 10) {
                continue;
            }
            System.out.println(i + ". kayit");
        }
    }
}

