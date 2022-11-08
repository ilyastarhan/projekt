package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ilyas\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabik");
            int k;
            try {
                while ((k = fis.read()) != -1) {
                    System.out.print((char) k);
                }
                System.out.println("icteki try blocktan selamlar");
            } catch (IOException e) {//dosyaya ulasilir fakat okunamazsa bu catch calisir
                System.out.println("belirttiginiz dosya okunamiyor");
                System.out.println("icteki catch block tan selamlar");
            }
        } catch (FileNotFoundException e) { //dosyaya ulasilamazsa bu catch calisir
            System.out.println("dosyaya ulasilamiyor");
            System.out.println("distaki catch block tan selamlar");

        }


    }
}
