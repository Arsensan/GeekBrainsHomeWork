package GeekBrainsLessons.HomeWork;

public class HomeWorkLesson2 {
    public static void main(String[] args) {
        System.out.println(isnumberRange10to20(5, 5));
        number(0);
        System.out.println(isNumber(-3));
        wordAndNumber("Привет!", 1);
        System.out.println(visokosniyYear(100));
    }

    public static boolean isnumberRange10to20(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void number(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отриательное");
        }
    }

    public static boolean isNumber(int a) {
        return (a < 0);
    }

    public static void wordAndNumber(String a, int b) {
        for (; b <= 5; b++) {
            System.out.println(a);
        }
    }

    public static boolean visokosniyYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}