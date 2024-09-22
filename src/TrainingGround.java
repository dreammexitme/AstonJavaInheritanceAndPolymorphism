
import heroes.Hero;
import heroes.Warrior;
import enemies.Enemy;
import heroes.Archer;
import heroes.Mage;

// Main file for testing the creation of hero and enemy objects, as well as their interactions.
public class TrainingGround {

    public static void main(String[] args) {

        Enemy enemy = new Enemy(40);

        Hero hero = new Hero("Maria");
        Hero warrior = new Warrior("Alex");
        Hero mage = new Mage("Brian");
        Hero archer = new Archer("Mulan");

        hero.attackEnemy(enemy);
        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);
    }
}
