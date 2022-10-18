package challange.Day10;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        String str = "HeySiri";
        str = str.replace("Hey", "Bye");
        String str2[] = new String[1];
        str2[0] = str;
        System.out.println(Arrays.toString(str2));


    }
}
