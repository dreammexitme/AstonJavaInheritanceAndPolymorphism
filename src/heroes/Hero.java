package heroes;

import enemies.Enemy;

public abstract class Hero {

    final private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
}
