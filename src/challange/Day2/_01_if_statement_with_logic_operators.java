package challange.Day2;

public class _01_if_statement_with_logic_operators {
    public static void main(String[] args) {

        int i = 60;
        if ((i % 9 == 0) && (i % 5 == 0)) {
            System.out.println("Able to divide by 9 and by 5");
        }
        if ((i % 4 == 0) && (i % 15 == 0)) {
            System.out.println("Able to divide by 4 and by 15");
        }

    }

}
