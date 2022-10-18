package challange.Day11;

public class Q02 {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        String arr = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        System.out.println(arr.replaceAll("\\s", "").length());
        String arryeni[] = arr.replaceAll("\\s", "").split("");
        System.out.println(arryeni.length);
    }
}
