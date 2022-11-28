package challange.Kasim.karisik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q03_CollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.print("Enter a number: ");
            numList.add(scan.nextInt());
            i++;
        }
        Collections.sort(numList);
        System.out.println("sort: " + numList);
        Collections.reverse(numList);
        System.out.println("reverse: " + numList);
        Collections.shuffle(numList);
        System.out.println("shuffle: " + numList);
        Collections.rotate(numList, 3);
        System.out.println("rotate 3: " + numList);
        System.out.println("Collections.max(numList) = " + Collections.max(numList));
        System.out.println("Collections.min(numList) = " + Collections.min(numList));
        Collections.replaceAll(numList, Collections.max(numList), Collections.min(numList));
        System.out.println(numList);
    }
}
