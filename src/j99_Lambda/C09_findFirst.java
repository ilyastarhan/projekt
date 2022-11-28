package j99_Lambda;

import java.util.*;

public class C09_findFirst {


    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küsleme", "küsleme", "küsleme", "soganli", "soganli", "trilice", "bicibici", "büryan", "melemen", "cacix", "kokorec", "yaglama", "güvec", "arabasi", "tantuni"));
        Optional<String> enBykKarktr2 = menu.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst();
    }
}
