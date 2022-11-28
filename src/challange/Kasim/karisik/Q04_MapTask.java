package challange.Kasim.karisik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q04_MapTask {
    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> groupName = new HashMap<String,ArrayList<String>>();
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList("Member1", "Member2"));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList("Member3", "Member4", "Member5"));
        groupName.put("Group1", group1);
        groupName.put("Group2", group2);
        for(Map.Entry<String, ArrayList<String>> entry: groupName.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
        }


    }

}
