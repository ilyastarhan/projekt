package challange;

public class tekarliharfsayisi {
    public static void main(String[] args) {


        String str = "adadkjakdnk akdj a 8182931 oa s90qe 12";
        String benzersiz = "";
        for (int i = 0; i < str.length(); i++) {
            if (!benzersiz.contains("" + str.charAt(i))) {
                benzersiz += "" + str.charAt(i);
            }
        }
        for (int i = 0; i < benzersiz.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (benzersiz.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            System.out.println(benzersiz.charAt(i) + " karakterinden " + count + " adet mevcut");
        }
    }
}