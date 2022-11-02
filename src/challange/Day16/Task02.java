package challange.Day16;

public class Task02 {
    public static void main(String[] args) {
        /*Bir Stringde uniqe karakteri bulup return eden method create ediniz
        Ex:
        String str1= "AAABBBCCCCDEF";
        String uniqe= "D"

         */
        String str1= "AAABBBCCCCDEF";
        System.out.println(uniq(str1));


    }

    private static String uniq(String str1) {
        String uniq = "";
        for(int i = 0; i < str1.length(); i++) {
            if(str1.indexOf(str1.charAt(i))==str1.lastIndexOf(str1.charAt(i))){
                uniq += str1.charAt(i);
                break;
            }
        }
        return uniq.length()==0? "uniq karakter yok" : uniq;
    }
}
