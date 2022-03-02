package level3;

public class Multiple {

    public static int result = 1;

    public static int multiplication(int num) {
        while (num > 1) {
            result = result * num;
            multiplication(num - 1);
            break;
        }
        return result;
    }

}
