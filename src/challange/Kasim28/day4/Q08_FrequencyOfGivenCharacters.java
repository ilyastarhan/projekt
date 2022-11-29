package challange.Kasim28.day4;

import java.util.HashMap;

public class Q08_FrequencyOfGivenCharacters {


    /*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
    public static void main(String[] args) {

        String str = "aaabbbbbcccccccc";
        frekans(str);

        HashMap<String, Integer> frekans = new HashMap<String, Integer>();
        for(int i = 0; i<str.length(); i++){
            if(frekans.containsKey(str.charAt(i)+""))
                frekans.put(str.charAt(i)+ "",frekans.get(str.charAt(i)+"")+1);
            else
                frekans.put(str.charAt(i)+"",1);

            }
        System.out.println(frekans);


    }
    public static void frekans(String str) {
        String output="";
        for(int i=0; i<str.length(); i++) {
            int count = 0;
            for(int j=i; j<str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if(!output.contains(str.substring(i,i+1))) {
                output+=str.charAt(i)+ "" +count;
            }
        }
        System.out.println("output = " + output);
    }
}
