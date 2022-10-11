package challange.Day07;

public class ForLoop2 {
    public static void main(String[] args) {
        System.out.println("for loop");
        for (int i = 0; i <= 255; i++) {

            System.out.println((char)i + "->" + i);
        }
        System.out.println();
        System.out.println("while loop");
        int i = 0;
        while (i <= 255) {
            System.out.println((char)i + "->" + i);
            i++;
        }
        System.out.println();
        System.out.println("do While loop");
        i=0;
        do {
            char karakter = (char) i;
            System.out.println((char)i + "->" + i);
            i++;

        }
        while (i <= 255);

    }
}
