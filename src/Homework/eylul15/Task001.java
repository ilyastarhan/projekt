package Homework.eylul15;

public class Task001 {
    public static void main(String[] args) {
        int k = 5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;//(1+5)+(6+1)+(7+1)+(-1+8)+(7-1)+6 =39
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);//6
    }


}
