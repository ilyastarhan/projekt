package challange.Day10;

public class Q02 {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int input[]= {1,2,3,4,5,6,7};
        double average = 0;
        double toplam = 0;
        for (int i=0; i<input.length; i++) {
            toplam+=input[i];
        }
        average = toplam/input.length;
        System.out.println("average = " + average);
        System.out.println("Ortalamadan büyük olan elemanlar");
        for (int i=0; i<input.length; i++) {
            if (input[i] > average) {
                System.out.print(input[i] + " ");
            }
        }


    }
}
