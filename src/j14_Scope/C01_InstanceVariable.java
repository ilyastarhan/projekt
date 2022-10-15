package j14_Scope;

public class C01_InstanceVariable {

    static String kurs = "clarus";
    /*												INSTANCE VARIABLE

	 	1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
	 		olusturulan variable'lara "instance variable" denir.
	 	2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
	 	3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
	 		Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
	 		Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
	 			"yas" variable'i initialize edildi, digerleri initialize edilmedi.
	 	4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
	 		Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
	 				byte, short, int, long icin default value 0'dir.
	 				float, double icin default value 0.0'dir.
	 				char icin default value 0'dir.
	 				boolean icin default value false'dur.
	 				String icin default value "null" dir.

	 */
 //ınsatnace obj variables...
 int yas = 48; //initialized ilk atamsı yapılmış ins. variable
    int tecrube;// default deger 0
    String name;// default deger null
    boolean developerMı;// deafult deger false
    double boy;// default deger 0.0
    char unvan;// default deger bosluk

    public static void main(String[] args) {//main bası

        int a = 7;//local vari.
        System.out.println(a);//7
        //System.out.println(yas);// inst değer atamsı yapmadan işleme alınmaz non-satatic oldg için doğrudan çağrılamaz
        System.out.println(kurs);//static varible doğrudan static methoda cağrıldı
        a = 24;
        System.out.println(a);//33

        staticMethod();//static method call edildi-> stral seyahat : static olan main sadece static method call eder

        // non_staticMethod(); //non-static method call edilemezzz...galaxi'de dünyalık olmaz

        // obj creation -> ClassName objName  =  new ClassName();

        C01_InstanceVariable ebikGabıkObj = new C01_InstanceVariable();//obj create edildi

        ebikGabıkObj.boy=1.9;//ınst variable obc ile call edilip atama yapıldı
        ebikGabıkObj.developerMı=true;
        ebikGabıkObj.name="kubra hanım";
        System.out.println(ebikGabıkObj.name);//kubra hanım
        System.out.println("ebikGabıkObj.tecrube = " + ebikGabıkObj.tecrube);//default deger : 0
        ebikGabıkObj.yas=33;
        System.out.println("ebikGabıkObj.yas = " + ebikGabıkObj.yas);//33

        C01_InstanceVariable obj1=new C01_InstanceVariable();//farklı bir obj1 isminde obj create edildi
        obj1.boy=1.75;
        obj1.name="fatih bey";
        System.out.println("obj1.boy = " + obj1.boy);//1.75
        System.out.println("obj1.name = " + obj1.name);//fatih bey


    }//main sonu
    //a=23;//local dısı call edilemez

    public void non_staticMethod() {//static olmayan method
        System.out.println("static olmayan methoddan agama bolcana selam :)");
    }

    public static void staticMethod() {//static method

        System.out.println("static güneş methoddasın agam dewamkee");
    }
}
