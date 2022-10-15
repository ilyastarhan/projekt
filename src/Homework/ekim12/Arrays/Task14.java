package Homework.ekim12.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        sumofDigits(str);



    }

    private static void sumofDigits(String str) {

        str = str.replaceAll("\\D", "");
        String arr[] = str.split("");

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=Integer.parseInt(arr[i]);
        }
        System.out.println("Toplamlari = " + toplam);

    }


}

