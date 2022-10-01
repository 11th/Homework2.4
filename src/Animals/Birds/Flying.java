package Animals.Birds;

import java.util.Objects;

/***
 * Летающие
 */
public class Flying extends Bird {
    private String moveType;

    public Flying(String name) {
        super(name);
        this.moveType = "полет";
    }

    public void fly(){
        System.out.println("Лечу");
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public void eat() {
        System.out.println("Клюю");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }

    @Override
    public void go() {
        System.out.println("Иду");
    }

    @Override
    public void hunt() {
        fly();
        eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(getName(), flying.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return String.format("%s - летающая птица", getName());
    }
}
