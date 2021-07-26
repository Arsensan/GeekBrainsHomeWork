package GeekBrainsLessons;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat (205,0,"Барсик");
        Dog dog = new Dog (160,100,"Шарик");
        dog.run();
        dog.swim();
        cat.run();
        cat.swim();
    }
}
