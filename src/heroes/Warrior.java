package heroes;

public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(String.format("Warrior %s swings their sword at the enemy.", getName()));
    }
}
