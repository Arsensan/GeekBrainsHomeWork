package GeekBrainsLessons.HomeWork;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class HomeworkLesson3 {
    public static void main(String[] args) {
        invertArray();
        from1to100array();
        fillArray();
        diagonal();
        System.out.println(Arrays.toString(methodLen(3, 3)));
        minMax();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void from1to100array() {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            } else {
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void diagonal() {
        int[][] arr = new int[][]{
                {1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 0, 0, 1}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static public int[] methodLen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void minMax() {
        int[] arr = new int[]{1, 2, 4, -3, 6, 88, -40, 2};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min=arr[i];
            }
        }
        System.out.println("Максимальное значение " +max);
        System.out.println("Минимальное значение " +min);
    }
}
