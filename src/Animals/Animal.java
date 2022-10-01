package Animals;

/***
 * Животные
 */
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this(name, 0);
    }

    public Animal(String name, int age) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
        setAge(age);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

    public final void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
