package Homework.eylul20;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/* Projeler.TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre (m) olarak giriniz: ");
        double boy = scan.nextDouble();
        System.out.print("Kilonuzu kilogram (kg) olarak giriniz: ");
        double kilo = scan.nextDouble();
        double vki = kilo / (boy * boy);
        if (vki <= 20) {
            System.out.println("Oldukca zayifsiniz");
        } else if (vki > 20 && vki <= 25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (vki > 25 && vki <= 30) {
            System.out.println("Sisman kategorisindesiniz");
        } else {
            System.out.println("Obez grubundasiniz");
        }


    }

}
