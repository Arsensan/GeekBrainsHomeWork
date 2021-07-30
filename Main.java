package GeekBrainsLessons;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 1, 2);
        cats[1] = new Cat("Murzik", 2, 4);
        cats[2] = new Cat("Lobzik", 3, 6);
        cats[3] = new Cat("Shustrik", 4, 8);
        Plate plate = new Plate(20);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            while (plate.getFood() > 0 && !cats[i].isNotHungry()) {
                cats[i].eat(plate);
                plate.info();
            }
        }
    }
}
