package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad= "Haluk";
        String soyad = "Bilgin";

        int a = 7;
        int b = 11;
        //birden cok String variable ile farkli data variable´lar "+" ile isleme alinirsa Java birlestirme yaparak
        //yeni bir String olusturur.
        System.out.println(ad+soyad+a+b);//

        System.out.println(a+ad+soyad+b);//

        System.out.println(a+b+ad+soyad);//

        System.out.println(" "+a+b);//

        System.out.println(ad+soyad+(a+b));//

        System.out.println((a+b)+ad+soyad);//

        System.out.println(ad+(a-b)+(a-b));//
        char ch = '1';
        System.out.println(ad+ch);
        System.out.println(a+ch+ad);
        System.out.println(ad+(ch+b));
        System.out.println(a+ad+ch);
        System.out.println(ch+ch+ad+ch);




    }

}
