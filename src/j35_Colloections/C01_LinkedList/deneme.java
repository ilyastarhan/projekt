package j35_Colloections.C01_LinkedList;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        String word = "jdklfjLKF KLELFJje jo!!!!)! )=!§!§)=(!)($!=)(26526515651651";
        char[] arr = word.toCharArray();
        String str2= Arrays.toString(arr).replaceAll("\\D", "");
        System.out.println(str2);
        String str = "";
        for(char each : arr){
            if(Character.isDigit(each))
                str+=each;
        }
        char[] arr2 = str.toCharArray();
        System.out.println(Arrays.toString(arr2));
    }
}
