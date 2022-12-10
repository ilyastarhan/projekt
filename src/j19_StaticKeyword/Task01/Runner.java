package j19_StaticKeyword.Task01;

public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */


    public static void main(String[] args) {
       Rectangle dikdortgen=new Rectangle();
       dikdortgen.length = 5;
       dikdortgen.width = 4;

        System.out.println("Cevre="+ dikdortgen.Cevre());
        System.out.println("Alan="+ dikdortgen.Alan());
    }
}
