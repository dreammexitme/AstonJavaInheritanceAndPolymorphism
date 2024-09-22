package heroes;

import enemies.Enemy;

public class Warrior extends Hero {

    private int damage = 20;

    public Warrior(String name) {
        super(name);
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("Warrior %s swings their sword at the enemy dealing %d damage.", getName(), getDamage()));
        enemy.takeDamage(getDamage());
    }
}
