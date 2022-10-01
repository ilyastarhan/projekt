package j09_Switch_Statement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen hangi ay icerisinde oldugunuzu sayi olarak belirtiniz: ");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 12:
            case 1:
            case 2:
                System.out.println("Girdiginiz ay Kis mevsimindendir");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Girdiginiz ay Ilkbahar mevsimindendir");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Girdiginiz ay Yaz mevsimindendir");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Girdiginiz ay Sonbahar mevsimindendir");
                break;
            default:
                System.out.println("Hatali bir sayi girdiniz...");


        }
        System.out.print("Lütfen hangi ay icerisinde oldugunuzu yazi ile belirtiniz: ");
        String ay = scan.next();
        switch (ay) {
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Girdiginiz ay Kis mevsimindendir");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Girdiginiz ay Ilkbahar mevsimindendir");
                break;

            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Girdiginiz ay Yaz mevsimindendir");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Girdiginiz ay Sonbahar mevsimindendir");
                break;
            default:
                System.out.println("Hatali bir veri girdiniz...");


        }


    }
}