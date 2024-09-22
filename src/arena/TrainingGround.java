package arena;

import heroes.*;
import enemies.*;

public class TrainingGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy(40);
        Hero warrior = new Warrior("Alex");
        Hero mage = new Mage("Brian");
        Hero archer = new Archer("Mulan");

        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);
    }
}
