package GeekBrainsLessons;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Coworker[] workerList = new Coworker[5];
        workerList[0] = new Coworker("Dobrinya Nikitich", "Policeman", "Popovich@mail.ru", 89777777, 33333, 33);
        workerList[1] = new Coworker("Alesha Popovich", "Army", "aleshanavsegda@mail.ru", 89777776, 34111, 35);
        workerList[2] = new Coworker("Ilya Muromec", "Waiter", "muromforeva@gamil.com", 89777775, 45222, 41);
        workerList[3] = new Coworker("Solovey Razboinik", "Musician", "songfromheart@list.ru", 89777771, 32111, 31);
        workerList[4] = new Coworker("Nikolay Baskov", "Artist", "goldencup@bk.ru", 89777778, 500000, 42);
        for(int i = 0; i< workerList.length; i++){
            if(workerList[i].getAge() > 40){
                System.out.println(workerList[i].info());
            }
        }
    }
}


