import Animals.Amphibians.Amphibian;
import Animals.Birds.Flightless;
import Animals.Birds.Flying;
import Animals.Mammals.Herbivore;
import Animals.Mammals.Predator;

public class Main {
    public static void main(String[] args) {
        Herbivore horse = new Herbivore("Лошадь");
        System.out.println(horse);
        Herbivore giraffe = new Herbivore("Жираф");
        System.out.println(giraffe);
        Herbivore gazelle = new Herbivore("Газель");
        System.out.println(gazelle);

        Predator hyena = new Predator("Гиена");
        System.out.println(hyena);
        Predator tiger = new Predator("Тигр");
        System.out.println(tiger);
        Predator bear = new Predator("Медведь");
        System.out.println(bear);

        Amphibian frog = new Amphibian("Лягушка");
        System.out.println(frog);
        Amphibian snake = new Amphibian("Уж");
        System.out.println(snake);

        Flightless peacock = new Flightless("Павлин");
        System.out.println(peacock);
        Flightless penguin = new Flightless("Пингвин");
        System.out.println(penguin);
        Flightless dodo = new Flightless("Птица додо");
        System.out.println(dodo);

        Flying gull = new Flying("Чайка");
        System.out.println(gull);
        Flying albino = new Flying("Альбинос");
        System.out.println(albino);
        Flying falcon = new Flying("Сокол");
        System.out.println(falcon);
    }
}