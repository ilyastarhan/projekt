package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("küsleme", "küsleme", "küsleme", "soganli", "soganli", "trilice", "bicibici", "büryan", "melemen", "cacix", "kokorec", "yaglama", "güvec", "arabasi", "tantuni"));


        // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

        karakterSayisiKontrol(menu);
        System.out.println("\n***************************");

        // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
        System.out.println(karakterW(menu));
        System.out.println("\n***************************");

        // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
        System.out.println("enAzBirEleman(menu) = " + enAzBirEleman(menu));

        System.out.println("\n***************************");
//111
    }
    public static boolean enAzBirEleman(List<String> menu){
        return menu.stream().anyMatch(t->t.toLowerCase().charAt(t.length()-1)=='x');
    }
    public static boolean karakterW(List<String> menu){
        return menu.stream().noneMatch(t -> t.toUpperCase().charAt(0) == 'W');

    }

    public static void karakterSayisiKontrol(List<String> menu) {
        System.out.println(menu.stream().allMatch(t -> t.length() <= 7));


    }
}
