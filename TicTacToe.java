package GeekBrainsLessons;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static void start() {
        char[][] field = getEmptyField();
        drawField(field);
        while (true) {
            doPlayerMove(field);
            if (isWin(field, 'X')) {
                System.out.println("Congratulation! You are winner");
                break;
            }
            if (isDraw(field)){
                System.out.println("DRAW! Try again!");
                break;
            }
            doAImove(field);
            if (isWin(field, '0')) {
                System.out.println("Sorry! You are loser");
                break;
            }
        }
    }
    static boolean isDraw(char[][]field) {
        for (int h = 0; h < field.length; h++) {
            for (int v = 0; v < field.length; v++) {
                if(isEmptyCell(field,h,v)){
                   return false;
                }
            }
        }
        return true;
    }
    static boolean isWin(char[][] field, char sign) {
        // horizontal
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }

        // vertical
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }

        //diagonal
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        }
        if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }
        return false;
    }

    static void doAImove(char[][] field) {
        Random random = new Random();
        int horizontal, vertical;
        do {
            horizontal = random.nextInt(field.length);
            vertical = random.nextInt(field.length);
        } while (isNotEmptyCell(field, horizontal, vertical));
        field[horizontal][vertical] = '0';
        drawField(field);
    }

    static void doPlayerMove(char[][] field) {
        int horizontal, vertical;
        do {
            System.out.println("Your chance. Please enter coordinates");
            horizontal = getCoordinate('v');
            vertical = getCoordinate('h');
        } while (isNotEmptyCell(field, horizontal, vertical));
        field[horizontal][vertical] = 'X';

        drawField(field);
    }
    static boolean isEmptyCell(char[][] field, int horizontal, int vertical) {
        return field[horizontal][vertical] == '-';
    }

    static boolean isNotEmptyCell(char[][] field, int horizontal, int vertical) {
        return !isEmptyCell(field,horizontal,vertical);
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int getCoordinate(char position) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;
        do {
            System.out.printf("Please, enter %s coordinate 1-3%n", position);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > 2);
        return coordinate;
    }

    static char[][] getEmptyField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }
}
