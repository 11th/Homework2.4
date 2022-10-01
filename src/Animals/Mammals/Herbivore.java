package Animals.Mammals;

import java.util.Objects;

/***
 * Травоядные
 */
public class Herbivore extends Mammal{
    private String foodType;

    public Herbivore(String name) {
        super(name);
        this.foodType = "трава";
    }

    public void pasture(){
        walk();
        eat();
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void eat() {
        System.out.println("Кушаю траву");
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
    public void walk() {
        System.out.println("Гуляю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(getName(), herbivore.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return String.format("%s - травоядное млекопитающее", getName());
    }
}
