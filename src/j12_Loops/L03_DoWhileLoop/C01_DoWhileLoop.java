package j12_Loops.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*While Loop önce sart kontrol edilir. True sonuc alinirsa body calisir.
        Do While Loop da ise önce body calisir. sonrasinda sart kontrol edilir.
        true ise devam eder false ise döngü kirilir.
        oyunlarda daha cok kullanilir

        Trick: While loop sart saglanmazsa hic calismayabilir ancak "do While" sart saglasin ya da saglamasin
        en az bir kez calisir.
         */
        int age = 33;
        while (age<40){
            System.out.println("agam kirka daha " + (40-age) + " yas var");
            age++;
        }

        do{
            System.out.println("agam kirk yasin hayirli olsun");
            age++;
        }
        while(age<40);



    }
}
