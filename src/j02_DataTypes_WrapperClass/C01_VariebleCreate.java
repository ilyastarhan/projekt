package j02_DataTypes_WrapperClass;

public class C01_VariebleCreate {
    public static void main(String[] args) {
        // 1.yol -> best practice (Recommended) tavsiye edilen
        int yas = 34;
        int maas = 40000;

        System.out.println(yas);
        System.out.println(maas);
        System.out.println("ilyasin baslangic maasi: " + maas);
        maas = 24000;

        System.out.println("ilyasin baslangic maasi: " + maas);
        //2. Yol
        int boy = 172; // degeri atanmayan boy isminde bir int tanimlandi declaration
        System.out.println(boy); //degeri atanmamis variable degeri hicbir aksiyonda kullanilmaz
        //3. Yol
        int yevmiye, age, kilo;
        yevmiye = 250;
        kilo = 100;
        age = 34;
        System.out.println(age);
        System.out.println(kilo);
        System.out.println(yevmiye);
        //TRICK Bir variable yalniz bir kez tanimlanabilir ancak birden fazla deger atanabilir.
        System.out.println (yevmiye + " " + age + " " + kilo + " " + age + " " + maas );
        System.out.println (yevmiye + " " + age + " " + kilo + " " + age + " " + maas );

    }
}
