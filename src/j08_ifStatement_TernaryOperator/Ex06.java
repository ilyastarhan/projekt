package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Ehliyetiniz var ise E yok ise H giriniz: ");
        char ehliyet = scan.next().toUpperCase().charAt(0);
        int tecrube;
        int km;

        if (ehliyet == 'E' || ehliyet =='e') {
            System.out.println("kac yillik tecrübeniz var: ");
            tecrube = scan.nextInt();
            if(tecrube>=7){
                System.out.println("Lütfen yaptiginiz km mesafeyi giriniz: ");
                km = scan.nextInt();
                if (km >= 100000) {System.out.println("kontak anahtarini alabilirsiniz");}
                else{System.out.println("Anahtari almaniz icin önce " + (100000 - km) + " km yol gitmeniz gerekiyor");}
            }
            else {System.out.println("anahtar almaniz icin yeteri kadar tecrübeniz yok" + "\nEhliyet almaniz icin " + (7 - tecrube) + " yila ihtiyaciniz var");
            }}
        else if (ehliyet =='H' || ehliyet =='h') {
            System.out.println("önce ehlieyet almaniz gerekmektedir");
        }
        else {
            System.out.println("yanlis karakter girdiniz...");
        }
}}