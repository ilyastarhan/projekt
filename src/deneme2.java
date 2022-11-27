public class deneme2 {
    public static void main(String[] args) {


        System.out.println(wordCount(" this     string has     wide       spaces "));


    }

    public static void printAcronym(String str) {
        String str2 = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            str2 += arr[i].charAt(0) + "";
        }
        System.out.println(str2);
    }

    public static String stutter(String s) {
        String str = "";
        for(int i =0; i<s.length(); i++){
            for(int j =0; j<2 ; j++){
                str+= s.charAt(i)+"";
            }
        }
        return str;

    }

    public static int wordCount(String s) {
        if(s==null)
            return 0;
        return s.trim().split("\\s+").length;
    }

    public static int numUnique(int a, int b, int c) {

        if (a == b && a == c)
            return 1;
        else if (a != b && a != c && b != c)
            return 3;
        else
            return 2;


    }

    public static void perfectNumbers(int num) {

        for (int i = 2; i <= num; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i)
                System.out.print(i + " ");

        }
    }

    public static boolean isPalindrome(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i) + "";
        }

        return str.equalsIgnoreCase(str2);
    }
}