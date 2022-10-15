package j15_Arrays;

import java.util.Arrays;

public class C06_MultiDimensionalArray {
    public static void main(String[] args) {
        /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
       *  icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */
        //Multidimensional array tanimalama ->
        int arr1[][] = new int[3][5];

        //trick array i uzunluklari ile tanimlamak icin inner uzunluklari esit olmali
        int site[][][] = new int[6][8][10];
        int okul24 [][] = new int[3][24];
        int okul21 [][] = new int[5][21];

        //MdArray eleman ekleme ...

        arr1[2][4] = 55;
        arr1[0][3] = 34;

        //elelmanlari girilerek Array tanimlama

        int arr [][] = {
                {1,2,3},//0
                {10,20},//1
                {101}//2
        }; ////3 katli yapi
        //101 eleman index [2][0]
        //MdArray elemanlari print etme
        System.out.println(Arrays.toString(arr[1]));//array 1 i yazdirir [10, 20]
        System.out.println(arr[1][1]);// array icerisindeki degeri yazdirir 20
        System.out.println(arr[1]);//referans degerini verir [I@30c7da1e
        System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [10, 20], [101]]
        System.out.println(Arrays.toString(arr)); //[[I@57829d67, [I@30c7da1e, [I@19dfb72a]

        // Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
//  toString methodu outer methodu Stringe cevirir
// outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
// referans degerlerini yazdirilir

//MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.
    }
}
