package Homework.ekim18;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */


        public static void main(String[] args) {
            int[] arr = {17,25,32,45,64,44,78,96,45,14,};

            System.out.println(duplicate(arr));

        }

    private static boolean duplicate(int[] arr) {
            boolean result = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++){
                    if (arr[i] == arr[j])
                        result = true;
                }
            }
            return result;
    }


}