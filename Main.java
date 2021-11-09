package GeekBrainsLessons;

JavaLeveL2.Homework1
import GeekBrainsLessons.Cat;
=======
 Homework8(Calculator)
public class Main {

    public static void main(String[] args) {
        new MyOwnCalculator();

    }
}

 СatsAndPlate
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

 Lesson6(EnchancedOOP)
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

import java.util.Arrays;
 Lesson-1

public class Main {

    public static void main(String[] args) {
 JavaLeveL2.Homework1
        Sportsmans[] sportsmans = {
                new Human("Иван", 2, 5),
                new Cat("Барсик", 4, 2),
                new Robot("Бэндер", 1, 10),

        };
        Tasks[] tasks = {
                new Wall(3),
                new RunRoad(6),
        };
        System.out.println("Сорвенования начинаются!");
        for (int i = 0; i <tasks.length; i++){
            for (int j = 0; j< sportsmans.length; j++){
                tasks[i].taskComplete(sportsmans[j]);
                }
            }
        }

    }
=======
        Coworker[] workerList = new Coworker[5];
        workerList[0] = new Coworker("Dobrinya Nikitich", "Policeman", "Popovich@mail.ru", 89777777, 33333, 33);
        workerList[1] = new Coworker("Alesha Popovich", "Army", "aleshanavsegda@mail.ru", 89777776, 34111, 35);
        workerList[2] = new Coworker("Ilya Muromec", "Waiter", "muromforeva@gamil.com", 89777775, 45222, 41);
        workerList[3] = new Coworker("Solovey Razboinik", "Musician", "songfromheart@list.ru", 89777771, 32111, 31);
        workerList[4] = new Coworker("Nikolay Baskov", "Artist", "goldencup@bk.ru", 89777778, 500000, 42);
        for(int i = 0; i< workerList.length; i++){
            if(workerList[i].getAge() > 40){
                System.out.println(workerList[i].info());
Lesson-1
            }
        }
    }
}
 СatsAndPlate



Lesson-1
 Lesson-1
 Lesson-1
Lesson-1
