package Animals.Mammals;

import Animals.Animal;

/***
 * Млекопитающие
 */
public abstract class Mammal extends Animal {
    private String habitat;
    private int speed;

    public Mammal(String name) {
        super(name);
    }

    public Mammal(String name, int age) {
        super(name, age);
        this.habitat = "наземная";
    }

    public abstract void walk();

    public final void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }
}
