package j33_Interface.j33_Interface;

public interface dısDonanım {

    public void kapi();//abs meth.

   abstract void kaporta();//abs meth.

    String RENK = "opak gırmızııı";//public static final variable

    public default String sisLamp(){//default conc. meth
        return "sisli havada dikkat";
    }
    static  void anten(){//static conc. method
        System.out.println("agam yine antin kuntin işlerdesin  :)");
    }
  // public static default void sorunMethode(){//CTE-> static default keyword aynı anda kullanılamazzz
  // }
    //dısDonanım obj = new dısDonanım();//can nat be instantiated -> obj olmaz o-la-mazzz

   //public static void main(String[] args) {//bad practice -> projede tek bir main method ve main Class kullanılmalı
   //    System.out.println("RENK = " + RENK);
   //    aga();//static meth call.
   //}
}
