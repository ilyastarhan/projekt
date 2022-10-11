package j13_BreakContinue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen string giriniz: ");
        String str = scan.nextLine().toLowerCase();
        int flag = 0;
        for(int i= 0; i<str.length(); i++){
            if(str.charAt(i)== 'a'){
                flag++;
            }
            else if(str.charAt(i)== 'c')
                break;
        }
        System.out.println("girilen ifade de " + flag + " 'a' karakteri vardir");
    }
}
