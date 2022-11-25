package j10_StringManipulations;

public class Task08 {
    public static void main(String[] args) {
        //Projeler.TASK :
        //   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
        //   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //    */
        String  s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println
                ("" +
                        s.charAt(s.indexOf("I"))
                +s.charAt(s.indexOf("L"))
                +s.charAt(s.indexOf("Y"))
                +s.charAt(s.indexOf("A"))
                +s.charAt(s.indexOf("S")));
        double sayı1 = 15.613;

        int sayı2 = (int)sayı1;

        System.out.println(sayı2);
        int aci1 =150, aci2 = 20, aci3 = 10;

        boolean valid = (aci1+aci2+aci3) ==180;



        if(valid) {

            System.out.println("it's a valid triangle");

        } else {

            System.out.println("Invalid triangle");

        }
        if(true) {

            System.out.println("Today is Friday");

            System.out.println("Tomorrow is day off");

            System.out.println("there is no java class tomorrow");

        }else if(false)

            System.out.println("Today is Saturday");
        boolean X = true;



        if( X == false) {

            System.out.println("One");

        }

        else if( X == false != true) {

            System.out.println("Two");

        }

        else  if(X == true) {

            System.out.println("Three");

        }

        else if(X != false) {

            System.out.println("Four");

        }


        int x = 1, y = 2, r=3;

        r *= x + y;

        System.out.print(r);
    }
}
