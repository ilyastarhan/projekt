package challange.Kasim28.day4;

import java.util.ArrayList;

public class Q13_DuplicateValue {
 /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        char[] charArr = str.toCharArray();

        ArrayList<Character> charList = new ArrayList<Character>();
        for(int i = 0; i < charArr.length; i++){
            for(int j = i+1; j < charArr.length; j++){
                if(charArr[j]==charArr[i]&& !charList.contains(charArr[i])){
                    charList.add(charArr[i]);
                }
            }
        }
        System.out.println(charList);


    }


}
