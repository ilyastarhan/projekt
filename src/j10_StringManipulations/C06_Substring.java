package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {
        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
        String a = "Java bilen sirti yere gelmez :)";
        System.out.println(a.substring(a.length() / 2));
        System.out.println(a.substring(a.length() - 10));
        System.out.println(a.substring(0, 10));
        System.out.println(a.substring(0, 1));

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir yazi yaziniz...");
        String input = scan.nextLine();
        if (input.length() != 4) {
            System.out.println("kelimeniz uzun veya kisa");
        } else {
            System.out.print(input.substring(3));
            System.out.print(input.substring(2,3));
            System.out.print(input.substring(1,2));
            System.out.print(input.substring(0,1) );
        }
    }
}