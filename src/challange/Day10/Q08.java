package challange.Day10;

public class Q08 {
    public static void main(String[] args) {
        // Q08_Arrays
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        double toplam=0;
        String arr1[][] = {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                if(arr1[i][j].contains("$")){
                    toplam+= Integer.parseInt(arr1[i][j].replace("$", ""))*3.2;

                }
                else
                    toplam+= Integer.parseInt(arr1[i][j].replace("€", ""))*4.2;

            }
        }
        System.out.println("toplam = " + toplam);
    }
}
