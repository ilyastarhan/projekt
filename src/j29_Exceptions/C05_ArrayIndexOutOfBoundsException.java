package j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //ArrayOutOfBoundsException -> array icerisinde olmayan bir index elemani ile islem yaptiginda alinir

        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata yakalandi");
        }
        System.out.println("sorun cözüldü devam ediyoruz.");
    }
}