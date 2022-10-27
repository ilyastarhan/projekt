package j22_DateTime.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    ArrayList<User> users = new ArrayList<>();


    public ArrayList<User> register() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String name = scan.nextLine();
        User user = new User(name, LocalDateTime.now());
        users.add(user);
        return users;


    }

    public void HappyUsers(ArrayList<User> users) {
        for (User each : users) {
            if (each.registerDate.getSecond() <= 10) {
                System.out.println("Sansli kullanici : " + each.name + " \nkayit zamani : " + each.registerDate);
            } else
                System.out.println(each.name + " Maalesef sansli kisi degilsiniz. daha sonra tekrar deneyiniz...");
        }
    }
}
