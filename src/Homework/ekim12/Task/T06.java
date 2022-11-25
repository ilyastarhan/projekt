package Homework.ekim12.Task;

public class T06 {
    public static void main(String[] args) {
        /* Projeler.TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */


        String str = "Javacilar cook afilli";
        String arr[] = str.split("");
        String yeniArr[][] = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j]))
                    count++;


            }

            System.out.print(arr[i] + "=" + count + ", ");

        }

    }

}
