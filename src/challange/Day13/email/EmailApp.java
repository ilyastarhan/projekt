package challange.Day13.email;

import java.util.Scanner;

public class EmailApp {
    String firstName, lastName,
            password, department, email, emailSuffix = "clarusway.com";
    int mailBoxCapacity = 1000,
            defaultPasswordLength = 12;


    EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = setRandomPassWord(defaultPasswordLength);
        this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + emailSuffix;
    }

    /*
    testautomation.
    fullstackdeveloper.
    salesforce.
    hicbiri --> ekleme yapilmayacak
     */
    public String setDepartment() {
        System.out.println("lütfen asagida belirtilen Departmanlardan herhangi birini seciniz: ");
        System.out.println("1-Test Automation\n2-Full Stack Developer\n3-Salesforce\n0-Hicbiri");
        Scanner scan = new Scanner(System.in);
        int options = scan.nextInt();
        if (options == 1) {
            return "testautomation.";
        } else if (options == 2) {
            return "fullstackdeveloper.";
        } else if (options == 3) {
            return "salesforce.";
        } else {
            return "";
        }

    }

    public String setRandomPassWord(int passwordLength) {
        if(passwordLength<8){
            System.exit(0);
        }
      //  String password = "";
        char[] password = new char[passwordLength];
        String passwordSet = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        for (int i = 0; i < passwordLength; i++) {
            password[i] = passwordSet.charAt((int) (Math.random() * (passwordSet.length())));
         //   password += "" + passwordSet.charAt((int) (Math.random() * (passwordSet.length())));
        }
        return new String(password);

    }
    public String showInfo(){
        return "Ad-Soyad: " + firstName + " " + lastName + "\n" +
                "Sirket Email: " + email + "\n" +
                "Capacity: " + mailBoxCapacity + "mb \n" +
                "Password: " +password;
    }
}