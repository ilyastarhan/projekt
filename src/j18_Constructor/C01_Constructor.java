package j18_Constructor;

public class C01_Constructor {

    /*
    1- constuctor ismi Class name ile ayni olmalidir. büyük harf
    2- constructor create edildiginde name den sonra () {} mutlaka kullanilmalidir.
    3- eger parametreli constructor create edildiginde Java default constructoru gözardi eder
    4- constructor return type olmaz. methoddan ayiran özelligidir bu.
    5- Class olsutugunda Java default constructoru kendi create eder.
     */
    String isim;
    String selam = "güzel insan";
    public static void main(String[] args) {
        // class name   obje name   new keyword     default constructor
        C01_Constructor obj1        = new           C01_Constructor();
        C01_Constructor obj2        = new           C01_Constructor();
        C01_Constructor obj3        = new           C01_Constructor();
        C01_Constructor obj4        = new           C01_Constructor();
        obj1.isim="javaCan";
        obj2.isim="javaTar";
        System.out.println(obj1.isim);
        System.out.println(obj2.isim);
        obj1.aga();


    }
    public void aga (){
        System.out.println("agaya selam");
    }
}
