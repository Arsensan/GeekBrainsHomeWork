package GeekBrainsLessons;

import java.util.Random;
import java.util.Scanner;

public class TicTacToePractice {
    static void start() {
        initMap();
        printMap();
        while (true) {
            playerMove();
            printMap();
            if (isWin(map, dotX)) {
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (isWin(map, dot0)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static Random rnd = new Random();
    static char[][] map;
    static char dotX = 'X';
    static char dot0 = '0';
    static char dotEmpty = '~';
    static int fieldSize = 5;
    public static Scanner sc = new Scanner(System.in);

    public static char[][] initMap() {
        map = new char[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                map[i][j] = dotEmpty;
            }
        }
        return map;
    }

    public static void printMap() {
        for (int i = 0; i <= fieldSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < fieldSize; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerMove() {
        int x, y;
        do {

            System.out.println("ВВедите координату по вертикали от 1 до 5");
            x = sc.nextInt() - 1;
            System.out.println("Введите координату по горизонтали от 1 до 5");
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = dotX;
    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > fieldSize || y < 0 || y > fieldSize) return false;
        if (map[x][y] == dotEmpty) return true;
        System.out.println("Поле занято");
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(fieldSize);
            y = rnd.nextInt(fieldSize);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = dot0;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (map[i][j] == dotEmpty) return false;
            }
        }
        return true;
    }

    static boolean isWin(char[][] map, char sign) {
        // horizontal
        for (int i = 0; i < map.length - 1; i++) {
            if (map[i][0] == sign && map[i][1] == sign && map[i][2] == sign && map[i][3] == sign) {
                return true;
            }
        }
        for (int i = 1; i < map.length; i++) {
            if (map[i][1] == sign && map[i][2] == sign && map[i][3] == sign && map[i][4] == sign) {
                return true;
            }
        }
        // vertical
        for (int i = 0; i < map.length - 1; i++) {
            if (map[0][i] == sign && map[1][i] == sign && map[2][i] == sign && map[3][i] == sign) {
                return true;
            }
        }
        for (int i = 1; i < map.length; i++) {
            if (map[1][i] == sign && map[2][i] == sign && map[3][i] == sign && map[4][i] == sign) {
                return true;
            }
        }
        //diagonal
        if (map[0][0] == sign && map[1][1] == sign && map[2][2] == sign && map[3][3] == sign) {
            return true;
        }
        if (map[1][1] == sign && map[2][2] == sign && map[3][3] == sign && map[4][4] == sign) {
            return true;
        }
        if (map[0][4] == sign && map[1][3] == sign && map[2][2] == sign && map[3][1] == sign) {
            return true;
        }
        if (map[1][3] == sign && map[2][2] == sign && map[3][1] == sign && map[4][0] == sign) {
            return true;
        }
        if (map[1][0] == sign && map[2][1] == sign && map[3][2] == sign && map[4][4] == sign) {
            return true;
        }
        if (map[0][1] == sign && map[1][2] == sign && map[2][3] == sign && map[3][4] == sign) {
        return true;
    }
        if (map[0][3] == sign && map[1][2] == sign && map[2][1] == sign && map[3][0] == sign) {
            return true;
        }
        if (map[1][4] == sign && map[2][3] == sign && map[3][2] == sign && map[4][1] == sign) {
            return true;
        }
        return false;
    }
}





