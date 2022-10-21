package j18_Constructor;

public class C05_Car {


    //Fields -> objenin üretilirken alacagi deger variable lari
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */
    int maxHiz;
    String model;
    public C05_Car(){}

    public C05_Car(int maxHiz, String model){
        this.maxHiz = maxHiz;
        this.model = model;
    }
    public C05_Car(int maxHiz){
        this("mercedes", 250);
      //  maxHiz = maxHiz;// this olmadigi icin parametre degeri instance.


    }
    public C05_Car(String model){
        this.model = model;
    }
    public C05_Car(String model, int maxHiz){
        this.model = model;
        this.maxHiz = maxHiz;
    }
}
