package j22_DateTime.Task;

import java.util.Scanner;

public class LoginPanel {
    public static void login(){
        Scanner scan = new Scanner(System.in);


        Registration newRegistration = new Registration();


        boolean exit = true;
        while (exit) {
            System.out.println("Yeni kayıt için -1-" +
                    "\nŞanslı Kullanıcıları Listelemek için -2-" +
                    "\nBütün Listeyi görüntülemek için -3-" +
                    "\nÇıkış için -4-");
            char secim = scan.next().charAt(0);
            switch (secim) {
                case '1':
                    newRegistration.register();
                    break;
                case '2':
                   newRegistration.HappyUsers(newRegistration.users);
                    break;
                case '3':
                    System.out.println(newRegistration.users);
                    break;
                case '4':
                    exit = false;
                    break;
                default:
                    System.out.println("hatali secim yaptiniz, tekrar deneyiniz...");
                    break;

            }

        }

    }

}
