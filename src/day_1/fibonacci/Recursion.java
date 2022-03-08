package day_1.fibonacci;

public class Recursion {

    public static int fib(int n) {
        check(n);
        if (n <= 1) return n;
        else
        return fib(n-1) + fib(n-2);
    }

    public static int[] cycleFib(int n) {
        check(n);
        int[] masFib = new int[n];
        masFib[0] = 0;
        masFib[1] = 1;

        for (int i = 2; i < n; i++) {
            masFib[i] = masFib[i - 1] + masFib[i - 2];
        }
        return masFib;
    }

    public static int[] shortMas(int n) {

        check(n);
        int[] masFib = new int[n];
        if (n > 3) {

            masFib[0] = 0;
            masFib[1] = 1;
            masFib[2] = 1;
            for (int i = 3; i < n; i++) {
                masFib[i] = masFib[i - 1] * 3 - masFib[i - 2];
            }
        }
        return masFib;
    }

    public static int check(int n) {
        if (n > 45) {
            System.out.println("Введённое число превышает допустимое значение." +
                    " Будет присвоено значение по умолчанию: 45");
            n = 45;
        }
        else if (n < 0) {
            System.out.println("Отрицательное число сделаем положительным...");
            n = Math.abs(n);
            System.out.println(n);
        } else if (n > 0 && n < 4) {
            n = 4;
        }
        return n;
    }
}
