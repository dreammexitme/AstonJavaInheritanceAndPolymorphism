package enemies;

public class Enemy {

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
        System.out.println(String.format("Enemy health remaining: %d", getHealth()));
    }
}
