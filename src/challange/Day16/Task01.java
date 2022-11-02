package challange.Day16;

public class Task01 {
    public static void main(String[] args) {
        /* verilen iki stringin en büyük ortak substringini bulup retrun eden method create ediniz.
        Ex:
        str1 = "bandana";
        str2 = "andac";
        ortak = "anda";
         */
        String str1 = "andac";
        String str2 = "bandana";

        System.out.println("ortakSub(str1,str2) = " + ortakSub(str1, str2));

    }

    private static String ortakSub(String str1, String str2) {
        String ortak = "";
        for(int i = 0; i < str1.length(); i++) {
            for(int j = str1.length() ; j>i ;  j--){
                if(str2.contains(str1.substring(i,j))){
                    ortak = str1.substring(i,j).length()>ortak.length() ? str1.substring(i,j) : ortak;
                    break;
                }
            }
        }
        return ortak.length()==0?"ortak parca yok": ortak;

    }
}
