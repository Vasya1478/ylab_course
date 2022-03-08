package day_1.level2;

public class MaxMin {

    public static int min(int one, int two, int three, int four) {
        return min(min(one, two), min(three, four));
    }

    public static int min(int one, int two) {
        if (one < two) return one;
        else return two;
    }

}
