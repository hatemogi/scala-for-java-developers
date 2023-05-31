import java.util.Arrays;
import java.util.List;

public class ControlStructures {
    static void conditionals(int x) {
        if (x == 1) System.out.println(x);
    }

    static void ifElseIf(int x) {
        if (x < 0)
            System.out.println("음수");
        else if (x == 0)
            System.out.println("zero");
        else
            System.out.println("양수");
    }

    static int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    static int min3(int a, int b) {
        return a < b ? a : b;
    }

    static void whileLoop() {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
            i++;
        }
    }

    static void forLoop() {
        var ints = Arrays.asList(3, 4, 5);
        for (int i: ints) System.out.println(i);

        for (int i: ints) {
            int x = i * 2;
            System.out.printf("i = %d, x = %d\n", i, x);
        }

        List<Integer> ints2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int i: ints2) {
            if (i % 2 == 0 && i < 5) {
                System.out.println(i);
            }
        }
    }

    static String switch1(int weekday) {
        String weekdayAsString = "";
        switch (weekday) {
            case 1: weekdayAsString = "월요일";
                break;
            case 2: weekdayAsString = "화요일";
                break;
            default: weekdayAsString = "기타";
                break;
        }
        return weekdayAsString;
    }

    static String switch2(int i) {
        String numAsString = "";
        switch (i) {
            case 1: case 3:
            case 5: case 7: case 9:
                numAsString = "홀수";
                break;
            case 2: case 4:
            case 6: case 8: case 10:
                numAsString = "짝수";
                break;
            default:
                numAsString = "범위초과";
                break;
        }
        return numAsString;
    }

    public static void main(String[] args) {
        ControlStructures.conditionals(3);
        ControlStructures.conditionals(1);
        System.out.println(ControlStructures.min(5, 3));
        System.out.println(ControlStructures.min3(5, 3));
        ControlStructures.whileLoop();
        ControlStructures.forLoop();
        System.out.println(ControlStructures.switch1(2));
        System.out.println(ControlStructures.switch2(3));
    }
}
