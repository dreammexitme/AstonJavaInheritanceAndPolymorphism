
import heroes.*;
import enemies.*;

// Main file for testing the creation of hero and enemy objects, as well as their interactions.
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
