package Animals.Amphibians;

import Animals.Animal;

import java.util.Objects;

/***
 * Земноводные
 */
public class Amphibian extends Animal {
    private String habitat;

    public Amphibian(String name) {
        super(name);
        this.habitat = "водная";
    }

    public void hunt(){
        go();
        eat();
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public void eat() {
        System.out.println("Кушаю");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }

    @Override
    public void go() {
        System.out.println("Ползу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(getName(), amphibian.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return String.format("%s - земноводное", getName());
    }
}
