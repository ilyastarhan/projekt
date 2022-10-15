package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
        Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
        Array olusturulurken 2 seyi declare etmeliyiz:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
        2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
        array= tepsiye benzer..
        Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
         isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */
        // Array tanımlama...
        int a;//declare dilen ama atanmayan primitive data
        int arr[] ;//declare (tanımlanan) edilen ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılamaz...

        String  isimArr[] ={"muharrem","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan String array
        //String [] isimArr1 ={"muharren","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan String array
        int sayıArr[]=new int[5];//java heap memorhy'de 5 default->0 olan int array  create edildi
        // [0,0,0,0,0]


        // Array'a eleman ekleme...
        sayıArr[2]=34;
        sayıArr[0]=35;
        sayıArr[1]=34;
        sayıArr[3]=61;
        sayıArr[0]=34;//  0 index array elamanı 34 değeri ile update edildi
        //array elemanlrı uniqe olmak zorunda değildir tekrarlı array elamnı olabilir.

        // Array eleman sayısı boyut değeri...

        System.out.println("sayıArr.length = " + sayıArr.length);//5


        // Array son elemanı ...
        System.out.println("array son elemanı :" + isimArr[isimArr.length - 1]);//özge
        isimArr[isimArr.length - 1]="QA Özge hanım";//array son eleman update edildi.


        // Array de olmayan eleman

        //okkalı bir TRICK ->  sayıArr[11]=23;//cte vermez ama olmayan eleman rte veririr-> array run time da oluşur

        String name = "ilyas";
        System.out.println(name.startsWith("l", 1));
        System.out.println(name.substring(3, 3));
        // Array elamanları print etme...
        for (int i = 0; i < isimArr.length; i++) {
            System.out.print(isimArr[i]+" ");
        }
        System.out.println();
        System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.lang.String;@79698539 -> isimArr referans değeridir
        System.out.println(Arrays.toString(isimArr));//isim Array sitringe çevrildi.

        for(int i=0; i<sayıArr.length; i++){
            if(sayıArr[i] %2 ==1){
                System.out.println(sayıArr[i]);
            }

        }
        for(int i=0; i<sayıArr.length; i++){
            if(i %2==0)
                System.out.println(sayıArr[i]);
            }

        String yeniarr [] = new String[isimArr.length];
        for(int i=0; i<isimArr.length; i++){
            if(isimArr[i].length() ==5 ){
                yeniarr [i] = isimArr[i];
            }
        }
        System.out.println(Arrays.toString(yeniarr));

        //Array elemanlari naturel (k>b : ascending b->k : descending, alfabetik) siralama

        Arrays.sort(isimArr);
        System.out.println(Arrays.toString(isimArr));

    }



    }
