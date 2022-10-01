package donguler;

public class q2 {
    public static void main(String[] args) {
        //0 ile 100 arasinda hem 3'e hem de 7'ey bölünebilen sayilar
        for(int i =1; i <100; i++) {
            if(i%3==0 && i%7==0) {
                System.out.println(i);
            }

        }

    }
}
