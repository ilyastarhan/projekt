package j19_StaticKeyword.Task04;

import java.util.Scanner;

public class Runner {
    /*
    Task 04->
     Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */



    public static void main(String[] args) {
        Bisiklet bisiklet= Bisiklet.bisikletOlsutur();
        Scanner oku=new Scanner(System.in);
        int secim=0;
         do{
             bisiklet.menuYaz();
             secim=oku.nextInt();
             bisiklet.islemYap(bisiklet, secim);
         }while(secim < 5);
    }









}
