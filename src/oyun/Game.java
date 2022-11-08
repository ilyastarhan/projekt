package oyun;

import java.util.Scanner;


public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);

    public void login(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Macera oyununa hosgeldiniz !");
        System.out.println("isminizi giriniz: ");
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectChar();
        start();


    }
    public void start(){
       while(true){
           System.out.println();
           System.out.println("===========================");
           System.out.println();
           System.out.println("Lütfen mekan seciniz");
           System.out.println("1 - Güvenli Ev  --> Size ait güvenli bir mekan, düsman yok!");
           System.out.println("2 - Magara      --> Karsiniza zombi cikabilir!");
           System.out.println("3 - Orman       --> Karsiniza vampir cikabilir!");
           System.out.println("4 - Nehir       --> Karsiniza ayi cikabilir!");
           System.out.println("5 - Magaza      --> Silah veya zirh alabilirsiniz!");
           System.out.println("Gitmek istediginiz yer");
           int selectLocation = scan.nextInt();
           while(selectLocation<0 || selectLocation>5){
               System.out.println("Lütfen gecerli bir yer seciniz: ");
               selectLocation = scan.nextInt();
           }switch(selectLocation){
               case 1: location = new SafeHouse(player);
                   break;
               default: location = new SafeHouse(player);
                   break;
           }
           if(!location.getLocation()){
               System.out.println("oyun bitti");
               break;
           }
       }

    }
}
