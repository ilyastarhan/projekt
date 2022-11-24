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
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 24, 36, 55, 63, 26, 35, 47, 85, 96));
        ciftKareMaximum(list);
    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz

    public static void ciftKareMaximum(List<Integer> list){
        Optional<Integer> maximumeleman = list.stream().filter(t-> t % 2 == 0).map(t-> (int)Math.pow(t,2)).reduce(Integer::max);//daha dar ama daha hizlidir
        // Task :   List                                                                                    reduce.(Math::max);//daha genis ancak daha yavastir
        System.out.println(maximumeleman);// eger filtreleme sonucunda null verme durumu varsa Optional Classtype data casting yapilir
    }
}
