package Homework.ekim13;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */
        int arr [] = {1,2,3,4};
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j]  == 4) result = false;

                }
            }
        }
        System.out.println("result = " + result);


    }
}