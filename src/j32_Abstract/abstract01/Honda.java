package j32_Abstract.abstract01;

public abstract class Honda {//parent abstract class

    public abstract void motor();

     void sunrooff(){
         System.out.println("agam keyfini bilirsennn  ama subroof extra ücret :)");
     }
// abs  class'da variable tanımlanabilir mi -> evet
    String name="Gülsüm team lead";
     //variable'lar abstarct tanımlanır mı? -> kesinlikle hayır
    //public  abstract  int yas=48;//-> o-la -mazzz


    abstract void koltuk();
     abstract void kapı();

    // final void finalMethod();//concerete method body'siz olamaz
    // final abstract void finalMethod();//abs method final olamaz

   //private void privateMethod();//concerete method body'siz olamaz
   //private  abstract void privateMethod();//abs method private olamaz

    //static void gunesMethod();//concerete method body'siz olamaz
    //static abstract void gunesMethod();//abs method static olamaz
    //Honda obj=new Honda();//melekler doğurmaz abs class obj uretmez...
}
