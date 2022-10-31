package j23_Varargs_StringBuilder.Varargs;



public class C02_Varargs {
    public static void main(String[] args) {

        // arr ve varargs method
        // varargs method parametreleri array gibi tanimladigi icin varargs methoda parametre olarak array de verilebilir
        int[] arr = {24,42,33,19,34,45,58,38};
        System.out.println(arrayToplam(arr));
        System.out.println("arrayToplamVarargs(arr) = " + arrayToplamVarargs(arr));


        System.out.println("Normal method ile toplamlari " + arrayToplamVarargs(arr));
        System.out.println("varargs methodu ile toplamlari " + arrayToplamVarargs(24, 42, 33, 19, 34, 45, 58, 38));
        System.out.println("arrayToplamVarargs(25,65,89,74,45) = " + arrayToplamVarargs(25, 65, 89, 74, 45));
    }

    private static int arrayToplamVarargs(int... a) {
        int toplam = 0;
        for(int value : a) {
            toplam+=value;
        }


        return toplam;
    }

    public static int arrayToplam(int[] arr) {

        int toplam=0;
        for(int value : arr){
            toplam+=value;
        }

        return toplam;

    }


}
