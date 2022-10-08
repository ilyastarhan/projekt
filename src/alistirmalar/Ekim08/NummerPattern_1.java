package alistirmalar.Ekim08;

public class NummerPattern_1 {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 1 + i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 1 + i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 5 - i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j + i > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; i + j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 7; i += 2) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= 2*i; j += 2) {
                    System.out.print(j);
                }
            } else
                for (int j = 2; j <= 2*i; j += 2) {
                    System.out.print(j);
                }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i >0 ; i--){

        }


    }

}
