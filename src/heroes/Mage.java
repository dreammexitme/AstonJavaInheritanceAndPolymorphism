package heroes;

public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(String.format("Mage %s casts a spell at the enemy.", getName()));
    }
}
