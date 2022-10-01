package Animals.Mammals;

import java.util.Objects;

public class Predator extends Mammal{
    private String foodType;

    public Predator(String name) {
        super(name);
        this.foodType = "мясо";
    }

    public void hunt(){
        go();
        eat();
    }

    @Override
    public void eat() {
        System.out.println("Кушаю мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }

    @Override
    public void go() {
        System.out.println("Догоняю");
    }

    @Override
    public void walk() {
        System.out.println("Гуляю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return Objects.equals(getName(), predator.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return String.format("%s - хищное млекопитающее", getName());
    }
}
