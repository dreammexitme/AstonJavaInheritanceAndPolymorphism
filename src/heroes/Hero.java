package heroes;

import enemies.Enemy;

public class Hero {

    final private String name;
    private int damage = 10;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("Hero %s attacks enemy dealing %d damage.", getName(), getDamage()));
        enemy.takeDamage(0);
    }
}
