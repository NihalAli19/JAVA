abstract class Character {
    int health, attackPower;
    String name;

    public Character(int health, int attackPower, String name) {
        this.health = health;
        this.attackPower = attackPower;
        this.name = name;
    }

    abstract void specialAbility();
    public Character attack(Character obj) {
        System.out.println(""+this.name+" has been attacked by "+obj.name);
       if (this.name.equals("Warrior")) {
           this.health = this.health - obj.attackPower;
           return new Warrior(health, attackPower, name);
       }
       else if (this.name.equals("Mage")) {
           this.health = this.health - obj.attackPower;
           return new Mage(health, attackPower, name);
       }
       else if (this.name.equals("Archer")) {
           this.health = this.health - obj.attackPower;
           return new Archer(health, attackPower, name);
       }
       else {
           return null;
       }

    }
    public void defend(Character obj) {
        System.out.println(""+this.name+" has successfully defendeding the attacks from "+obj.name);
    }
}

class Warrior extends Character {

    public Warrior(int health, int attackPower, String name) {
        super(health, attackPower, name);
    }

    public void specialAbility() {
        System.out.println("Warrior's Attack power doubled!");
        attackPower *= 2;
    }
}

class Mage extends Character {

    public Mage(int health, int attackPower, String name) {
        super(health, attackPower, name);
    }

    public void specialAbility() {
        System.out.println("Mage's Attacked power increased by 20!");
        attackPower += 20;
    }
}
class Archer extends Character {

    public Archer(int health, int attackPower, String name) {
        super(health, attackPower, name);
    }

    public void specialAbility() {
        System.out.println("Archer's Attack power increased by 15!");
        attackPower += 15;
    }
}
public class Q3 {
    public static void main(String[] args) {
        String name;
        int health, attackPower;
        Warrior warrior = new Warrior(100,25,"Warrior");
        Mage mage = new Mage(100, 30, "Mage");
        Archer archer = new Archer(100, 15, "Archer");

        Warrior warrior1 = warrior;
        Mage mage1 = mage;
        Archer archer1 = archer;

        warrior.attack(mage);
        warrior.specialAbility();
        health = warrior.health;
        System.out.println("Warrior's health: "+health);

        mage.specialAbility();
        mage.attack(warrior);
        archer.attack(warrior);
        health = mage.health;
        System.out.println("Mage's health: "+health);
        health = archer.health;
        System.out.println("Archer's health: "+health);

        warrior.specialAbility();
        warrior.defend(archer);
        warrior.attack(archer);
        health = archer.health;
        System.out.println("Warior's health: "+health);

        warrior.attack(mage);
        health = mage.health;
        System.out.println("Mage's health: "+health);
    }
}
