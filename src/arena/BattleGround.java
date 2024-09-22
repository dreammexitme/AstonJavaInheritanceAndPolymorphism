package arena;

import heroes.*;
import enemies.*;

public class BattleGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy(50);
        Hero hero = new Warrior("Aston");

        System.out.println(String.format("Battle starts! Enemy starting health: %d.", enemy.getHealth()));
        while (enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                System.out.println("Battle continues!");
            }
        }

        System.out.println("Victory! The enemy has been defeated!");
    }
}
