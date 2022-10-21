package j19_StaticVariable;

public class C01_Teacher {

    String name;
    static String school= "Kabatas";
    int experience;

    public C01_Teacher(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }
    public static void maasHesapla(){
        System.out.println("Agam helal hos olsun afiyetle maasini haracayabilirsin");

    }
    public void evlilikYildonumu(){
        System.out.println("agama bir yastikta en az kirk yil");
    }


}
