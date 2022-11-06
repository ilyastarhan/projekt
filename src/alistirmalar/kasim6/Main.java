package alistirmalar.kasim6;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int myInt = 100;
        String myString = "";
        for(int i = Integer.toString(myInt).length()-1; i>=0; i--) {

            myString += Integer.toString(myInt).charAt(i);
        }
        System.out.println(myString);
        System.out.println(myString.length());

        char[] arr = myString.toCharArray();
        System.out.println(Arrays.toString(arr));

        String a = "  qwemand  qkweklqeq qwekqke qwe   qweqeq eqe qwe ";
        System.out.println(a.trim());

    }
    }