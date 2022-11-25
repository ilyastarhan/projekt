package j15_Arrays;

public class Task11 {
    public static void main(String[] args) {
/*
 Projeler.TASK :
 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.


      */

        int[] siralama = {1,2,3,4,5};


        for(int i=0; i<siralama.length/2; i++) {

            int gecici = siralama[i];
            siralama[i] = siralama[siralama.length-i-1];
            siralama[siralama.length-i-1] = gecici;

        }
        for(int i=0; i<siralama.length ; i++) {
            System.out.println(siralama[i]);
        }

        String str = "$1 $23 $134 $2 $7 $24 €32 €40 €2 €65 €4 ";
        String dolar [] = str.split(" ");
        int dolartoplam = 0;
        int eurotoplam = 0;
        for(int i = 0; i < dolar.length; i++) {
            if(dolar[i].contains("$")){
                dolartoplam+=Integer.parseInt(dolar[i].replace("$", ""));
            }
            else if(dolar[i].contains("€")){

                eurotoplam+=Integer.parseInt(dolar[i].replace("€", ""));
            }

            }
        System.out.println("eurotoplam = " + eurotoplam);
        System.out.println("dolartoplam = " + dolartoplam);

    }


    }

