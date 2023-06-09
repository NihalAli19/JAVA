abstract class GameObject {
    private String name;
    private int x,y;

    public GameObject(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    abstract void draw();
}
class Player extends GameObject {
    int health;

    public Player(String name, int x, int y, int health) {
        super(name, x, y);
        this.health = health;
    }
    @Override
    public void draw() {
        System.out.println("Health: "+health);
    }
}
class Enemy extends GameObject {
    int damage;

    public Enemy(String name, int x, int y, int damage) {
        super(name, x, y);
        this.damage = damage;
    }
    @Override
    public void draw() {
        System.out.println("Damage: "+damage);
    }
}
class PowerUp extends GameObject {
    String effect;

    public PowerUp(String name, int x, int y, String effect) {
        super(name, x, y);
        this.effect = effect;
    }
    @Override
    public void draw() {
        System.out.println("Effect: "+effect);
    }
}

class Game {
    private GameObject[] gameObjects;

    public void DrawAll(GameObject[] gameObjects) {
        for (int i = 0; i < 3; i++) {
            gameObjects[i].draw();
        }
    }

}
public class A2_Q4_22K_4054 {
    public static void main(String[] args) {
        String name = "22K-4054";

        GameObject player = new Player(name,5,6, 89);
        player.draw();
        GameObject enemy = new Enemy(name,6,5,40);
        enemy.draw();

        GameObject powerUp = new PowerUp(name,10,4,"Poison");
        powerUp.draw();

        GameObject[] gameObjects = {player, enemy, powerUp};

        Game game = new Game();

        GameObject player1 = new Player(name,5,9,95);
        GameObject player2 = new Player("18K-0137",6,10,95);

        if (((((Player) player1).health)) == (((Player)player2).health)) {
            System.out.println("The two players "+(player1.getName()) +" and "+ (player2.getName())+ " have same health.");
        }
        else {
            System.out.println("The two players "+(player1.getName()) +" and "+ (player2.getName())+" have different health.");
        }
    }
}
