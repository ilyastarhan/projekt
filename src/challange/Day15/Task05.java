package challange.Day15;

public class Task05 {
    public static void main(String[] args) {

        sumAll(5,9,11,13,15,17,19);


    }
    public static void sumAll(int ...num){
        int sum = 0;
        for(int value : num){
            sum+=value;
        }
        System.out.println("sum = " + sum);
    }
}
