package enemies;

import interfaces.Mortal;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, health);
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            setHealth(getHealth() - damage);
        }
        System.out.println(String.format("Enemy health remaining: %d. Enemy is %s.", getHealth(), isAlive() ? "alive" : "dead"));
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
