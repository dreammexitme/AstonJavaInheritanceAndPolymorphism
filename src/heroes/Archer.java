package heroes;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println(String.format("Archer %s shoots an arrow at the enemy.", getName()));
    }
}
