package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */
        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        ArrayList<String> isimler1 =new ArrayList<String>(Arrays.asList(isimler));
        String temp = isimler1.get(2);
        isimler1.set(2, isimler1.get(7));
        isimler1.set(7, temp);
        System.out.println("isimler1 = " + isimler1);


    }
}
