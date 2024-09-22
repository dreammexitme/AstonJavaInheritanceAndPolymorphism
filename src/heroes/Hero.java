package heroes;

public class Hero {

    final private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy() {
        System.out.println(String.format("Hero \"%s\" attacks enemy.", getName()));
    }
}
