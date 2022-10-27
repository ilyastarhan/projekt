package j22_DateTime.Task;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPanel {
    public static void login(){
        Scanner scan = new Scanner(System.in);

        Registration newRegistration = new Registration();
        ArrayList <User> newUser = new ArrayList<>();
        boolean exit = true;
        while (exit) {
            System.out.println("Yeni kayıt için -1-" +
                    "\nŞanslı Kullanıcıları Listelemek için -2-" +
                    "\nBütün Listeyi görüntülemek için -3-" +
                    "\nÇıkış için -4-");
            switch (scan.nextInt()) {
                case 1:
                    newUser = newRegistration.register();
                    break;
                case 2:
                    newRegistration.HappyUsers(newUser);
          //          newRegistration.HappyUsers(newRegistration.users);
                    break;
                case 3:
                    System.out.println(newUser);
                    //          System.out.println(newRegistration.users);
                    break;
                case 4:
                    exit = false;
                    break;
                default:
                    System.out.println("hatali secim yaptiniz, tekrar deneyiniz...");
                    break;

            }

        }

    }

}
