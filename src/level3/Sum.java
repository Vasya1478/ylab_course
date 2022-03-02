package level3;

public class Sum {
    public static int result = 0;

    public static void sum(int num) {
        for (int i = 1; i < num; i++) {
            result = result + i;
            System.out.println(result);
        }
    }
}
