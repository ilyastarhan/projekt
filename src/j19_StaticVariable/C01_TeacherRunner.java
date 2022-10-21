package j19_StaticVariable;

public class C01_TeacherRunner {
    /*
            => Class'in icinde methodlarin disinda olusturulan variable'lara "instance variable" denir.
             => Class'in icinde methodlarin disinda olusturulan static variable'lara "Class variable" denir.
             => Instance variable'lar gibi Class variable(Static variable)'lar initial edilmezse(ilk değere ataması) default value ataması yapılır
             => Static variable'lar call etmek  icin object olusturmaya gerek yoktur.
             => Bulunduğu  class icinden static yapılara  ulasilabilir.Farklı class'lardan ClassName.staticYapı class name ile call edilir.
                  farklı class'da obj name ile değl class name ile call edilir.
             => Instance variable(Object Variable)'lar call etmek icin object create edilmesi zorunludur.Object olusturmadan
                instance variable'a ulasilamaz.
             => Static variable'lara object ile call edilebilir ama tavsiye edilmez.
             => Eger static variable'lara object ile call edilirse Java  sari alt cizgi ikaz eder->.BAD PRACTICE
            =>   static keyword hafıza opt. için kullanılır ve memory'de 1 kez oluşturulur

        bir obj static variable değeri değişirse tün obj variable değeri değişir
        static obj den bağımsızdır class'a bağımlı Class'ın malıdır.

        Trick-> bir variable, methoda doğrudan calss name ile obj olmadan call etmek için static olmalıdır..

         */
    public static void main(String[] args) {

        C01_Teacher hoca1 = new C01_Teacher("Cuneyt", 11);
        System.out.println("hoca1.experience = " + hoca1.experience);
        System.out.println("hoca1.name = " + hoca1.name);
        C01_Teacher hoca2 = new C01_Teacher("Bekir", 7);
        System.out.println("hoca2.experience = " + hoca2.experience);
        System.out.println("hoca2.name = " + hoca2.name);
        C01_Teacher hoca3 = new C01_Teacher("Nazim", 13);
        System.out.println("hoca3.experience = " + hoca3.experience);
        System.out.println("hoca3.name = " + hoca3.name);
        System.out.println("C01_Teacher.school = " + C01_Teacher.school);

        hoca1.evlilikYildonumu();
        C01_Teacher.maasHesapla();
        hoca2.maasHesapla();

    }
}
