package challange.Day03;


import java.util.Scanner;

public class Q04_SwitchCase {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen günü yaziniz: ");
        String day = scan.nextLine();
        switch (day.toLowerCase()) {
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi günleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi günleri");
                break;
            case "pazar":
                System.out.println("Izin günü");
                break;
            default:
                System.out.println("Hatali veri girdiniz...");
                break;

        }
    }
}
