package Homework.eylul15;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//(4+1))
        x += x;//(5+5)=10
        --x;//(-1+10)=9
        x = 7 + x;//(7+9)=16
        x *= x;//(16*16)=256
        x -= 3;//(256-3)=253

        System.out.println(" x = " + x );//253
        
        int a = 3;
        double d = 4.5;

        d+=a;//7,5
        a+=d;//10
        d-=a;//-2,5
        a-=d;//12

        System.out.println(" d = " + ++d );//sonuc= -1,5, d= -1,5
        System.out.println(" a = " + a-- );//sonuc= 12, bir sonraki islemde a degeri =11



    }

}
