package Animals.Birds;

import java.util.Objects;

/***
 * Нелетающие
 */
public class Flightless extends Bird {
    private String moveType;

    public Flightless(String name) {
        super(name);
        this.moveType = "ходьба";
    }

    public void walk(){
        go();
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
        go();
        eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return String.format("%s - нелетающая птица", getName());
    }
}
