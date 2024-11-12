abstract class Creature {
    String name = null;
    boolean isAlive = false;

    abstract void bear();
    abstract void die();

    public void shoutName() {
        if (name != null) {
            System.out.println(name);
        } else {
            System.out.println("error");
        }
    }
}
class Human extends Creature {
    Human(String name) {
        this.name = name;
        this.isAlive = true;
        