package oyun;

import java.util.Scanner;

public class Player {
    private String name, characterName;
    private int damage, health, money, rHealth;
    private Inventory inventory;

    public int getrHealth() {
        return rHealth;
    }

    public void setrHealth(int rHealth) {
        this.rHealth = rHealth;
    }

    Scanner scan = new Scanner(System.in);

    public void selectChar() {
        switch (charMenu()) {
            case 1:
                initPlayer("Samuray", 5,21,15);
                break;
            case 2:
                initPlayer("Okcu", 7,18,20);
                break;
            case 3:
                initPlayer("Sovalye", 8,24,5);
                break;
            default:
                initPlayer("Samuray", 5,21,15);
                break;
        }
        System.out.println("Secilen karakter : " + getCharacterName() +
                ", Hasar :" + getDamage() + ", Saglik: " + getHealth() + ", Para: " + getMoney());


    }
    public void initPlayer(String characterName, int damage, int health, int money){
        setName(characterName);
        setDamage(damage);
        setHealth(health);
        setMoney(money);
    }

    public int charMenu() {
        System.out.println("Lütfen karakter seciniz: ");
        System.out.println("1- Samuray \tHasar : 5 \tSaglik : 21 \tPara : 15");
        System.out.println("2- Okcu \tHasar : 7 \tSaglik : 18 \tPara : 20");
        System.out.println("3- Sovalye \tHasar : 8 \tSaglik : 24 \tPara : 5");
        System.out.println("Karakter Seciminiz:");
        int charId = scan.nextInt();
        while (charId < 1 || charId > 3) {
            System.out.println("Lütfen gecerli bir karakter seciniz: ");
            charId = scan.nextInt();

        }
        return charId;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
