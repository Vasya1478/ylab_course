package day_2.level4.task1;

public class Maximum {
    public static int max(int one, int two, int three, int four) {
        return max(max(one, two), max(three, four));
    }

    public static int max(int one, int two) {
        if (one > two) return one;
        else return two;
    }
}
