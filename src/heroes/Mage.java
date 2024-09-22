package heroes;

import enemies.Enemy;

public class Mage extends Hero {

    private int damage = 25;

    public Mage(String name) {
        super(name);
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("Mage %s casts a spell at the enemy dealing %d damage.", getName(), getDamage()));
        enemy.takeDamage(getDamage());
    }
}
