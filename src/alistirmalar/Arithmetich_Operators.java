package alistirmalar;

public class Arithmetich_Operators {
    public static void main(String[] args) {
        int yil = 2022;

        boolean artik = false;

        if(yil % 4 == 0){

            if( yil % 100 == 0)

            {

                if ( yil % 400 == 0)

                    artik = true;

                else

                    artik = false;

            } else

                artik = true;

        }

        else

            artik = false;



        if(artik)

            System.out.println(yil + " artık yıldır.");

        else

            System.out.println(yil + " artık yıl değildir.");

        int a = 3;
        int b = 4;
        int c = a + b;
        System.out.println(c);
        System.out.println(a + b);
        a++;
        --b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Pre/Post-Increment
        int x = 10;
        int y = 10;
        System.out.println(x++); //10(11)
        System.out.println(++x); //12
        System.out.println(y--); //10 (9)
        System.out.println(--y); //8
        System.out.println(x++ + ++x);// 12 + 14= 26
        System.out.println(y++ + y++);// 8 + 9 = 21
        // degiskenden sonra yapilan artitimlar sonraki islemde uygulanir

        System.out.println(y); // y=10
        System.out.println(++x + ++x); // 15 + 16 = 31

        short a1 = 10;
        short b1 = 10;
        int a2 = (short) (a1+b1);
        System.out.println("a2= " + a2);

    }
}
