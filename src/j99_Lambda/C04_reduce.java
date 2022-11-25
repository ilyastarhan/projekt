package j99_Lambda;

import java.util.*;

public class C04_reduce {
    /*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 24, 5, 55, 63, 26, 35, 47, 85, 3));
       // ciftKareMaximum(list);
        toplamlari(list);
        System.out.println("toplami " + list.stream().reduce(0, (a, b) -> a + b));
        System.out.println("Carpimi " +list.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (a, b) -> a * b));
        //a-> ilk degerini her zaman atanan identity degerden alir
        //b-> degerini her zaman stream akistan alir
        //a-> ilk degerden sonrakileri action(islem body) den alir

        System.out.println("1.yol -> " + list.stream().reduce(Math::min));//1.yol
        System.out.println("2.yol -> " + list.stream().reduce(Integer::min));//2.yol
        System.out.println("3.yol -> " + list.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u));//3.yol listenin bos oldugu durumda integer max yazdirir
        System.out.println("4.yol -> " + list.stream().reduce(C04_reduce::enKucuk));//4.yol

        System.out.println(list.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Math::min));

    }
    public static int enKucuk(int a, int b){
        return a < b ? a : b;

    }


    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    public static void toplamlari(List<Integer> list){

        Optional<Integer> toplam =list.stream().reduce(Integer::sum);
        System.out.println(toplam);
    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz

    public static void ciftKareMaximum(List<Integer> list){
        Optional<Integer> maximumeleman = list.stream().filter(t-> t % 2 == 0).map(t-> (int)Math.pow(t,2)).reduce(Integer::max);//daha dar ama daha hizlidir
        // Task :   List                                                                                    reduce.(Math::max);//daha genis ancak daha yavastir
        System.out.println(maximumeleman);// eger filtreleme sonucunda null verme durumu varsa Optional Classtype data casting yapilir
    }
}
