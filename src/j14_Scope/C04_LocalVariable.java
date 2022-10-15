package j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {//main bası
        int yas=33;//main method local variable

        System.out.println("yas = " + yas);//33

        for (int i = 0; i < 7; i++) {//for loop bası
            System.out.print(yas+" :) ");//yas local variable aynı localle call edildi
            i++;//i loop variable loop  içi call edildi
        }//for loop sonu

        //i=34;//local dısı call edilemez

        yas=35;//local variable local'inde call adildi
    }//main sonu
    // yas=48;//local dısı call edilemz
}
