package heroes;

import enemies.Enemy;

public class Archer extends Hero {

    private int damage = 15;

    public Archer(String name) {
        super(name);
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("Archer %s shoots an arrow at the enemy dealing %d damage.", getName(), getDamage()));
        enemy.takeDamage(getDamage());
    }
}
