package challange.Day07;

public class ForLoop3 {
    public static void main(String[] args) {

        String str = "Java";
        for(int i = 0; i <str.length(); i++) {
            System.out.println(str.charAt(i) + "*");

        }

        System.out.println();
        for(int i = 100; i >0; i-=2) {
            System.out.print(i + " ");
        }
    }

}
