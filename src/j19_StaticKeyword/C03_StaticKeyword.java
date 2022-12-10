package j19_StaticKeyword;

public class C03_StaticKeyword {
    int id;//öğrenci no
    static int mevcut;//sınıf mevcudu
    public C03_StaticKeyword(){
        mevcut++;
        id+=mevcut;
    }
    public static void main(String[] args) {
        C03_StaticKeyword a=new C03_StaticKeyword();//a öğrencisi kayıt oldu
        C03_StaticKeyword b=new C03_StaticKeyword();//b öğrencisi kayıt oldu
        C03_StaticKeyword c=new C03_StaticKeyword();//c öğrencisi kayıt oldu
        C03_StaticKeyword d=new C03_StaticKeyword();//d öğrencisi kayıt oldu
        C03_StaticKeyword e;//new keyword ü olmadığı için e kayıt olmadı
        System.out.println(a.id);//a nın id si 1 dir
        System.out.println(b.id);//b nın id si 2 dir
        System.out.println(c.id);//c nın id si 3 dir
        System.out.println(d.id);//c nın id si 4 dir
        System.out.println(a.mevcut);//mevcut static olduğu için herkes için 4
        System.out.println(b.mevcut);//mevcut static olduğu için herkes için 4
        System.out.println(c.mevcut);//mevcut static olduğu için herkes için 4
        System.out.println(d.mevcut);//mevcut static olduğu için herkes için 4
    }
}
