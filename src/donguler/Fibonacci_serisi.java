package donguler;

public class Fibonacci_serisi {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int toplam;

        for(int i = 0; i<10; i++){
            System.out.print(x+" ,");
            toplam=x+y;
            x=y;
            y=toplam;

        }
    }
}
