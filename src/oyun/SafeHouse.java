package oyun;

public class SafeHouse extends NormalLocation{
    SafeHouse(Player player){
        super(player, "Safe House");
    }
    public boolean getLocation(){
        player.setHealth(player.getrHealth());
        System.out.println("Caniniz doldu");
        System.out.println("Su an güvenli evdesiniz");
        return true;
    }
}
