package challange.Kasim28.day4;

public class Q07_ConvertToNegativeFormString {

    /*
         Convert the given Array to negative form sentence into a String.
         Input:
         String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
         Output:
         String output ="JavaIsNOTDifficult";
          */
    public static void main(String[] args) {

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String str = "";
        for(int i=0; i<arr.length; i++){
            str+=arr[i];
        }
        System.out.println("str = " + str);
        String negativeStr= str.replaceAll("Is", "IsNOT");
        System.out.println(negativeStr);


    }
}
