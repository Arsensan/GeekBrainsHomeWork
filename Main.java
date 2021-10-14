package GeekBrainsLessons;

import GeekBrainsLessons.Cat;

public class Main {

    public static void main(String[] args) {
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