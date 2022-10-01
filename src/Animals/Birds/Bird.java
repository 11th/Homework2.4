package Animals.Birds;

import Animals.Animal;

/***
 * Птицы
 */
public abstract class Bird extends Animal {
    private String habitat;

    public Bird(String name) {
        super(name);
        this.habitat = "наземная/воздушная";
    }

    public abstract void hunt();

    public String getHabitat() {
        return habitat;
    }
}
