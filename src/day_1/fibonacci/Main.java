package day_1.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {

                System.out.println("Введите номер задания: 1, 2 или 3...");
                String choice = reader.readLine();
                Scanner scanner = new Scanner(System.in);

                switch (choice) {
                    case "1":
                        System.out.println("Рекурсивный метод: ");
                        System.out.println("Введите число от 0 до 45...");
                        try {
                            int num = scanner.nextInt();
                            System.out.println(Recursion.fib(num));
                        } catch (InputMismatchException e) {
                            e.printStackTrace();
                        }
                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Цикл + память: ");
                        System.out.println("Введите число от 0 до 45...");
                        try {
                            int num = scanner.nextInt();
                            int[] mas = new int[num];
                            mas = Recursion.cycleFib(num);
                            if (num > 4) {
                                for (int i = 0; i < num; i++) {
                                System.out.print(mas[i] + " ");
                                }
                            } else {
                                for (int i = 0; i < num; i++) {
                                    System.out.print(mas[i] + " ");
                                }
                            }
                        } catch (InputMismatchException e) {
                            e.printStackTrace();
                        }
                        System.out.println();
                        break;
                    case "3":
                        System.out.println("Сокращение использования памяти: ");
                        System.out.println("Введите число от 0 до 45...");
                        try {
                            int num = scanner.nextInt();
                            if (num > 0 && num < 4) {
                                System.out.println(" Будет присвоено значение по умолчанию: 4");
                                num = 4;
                            }
                            int[] mas = new int[num];
                            mas = Recursion.shortMas(num);
                            if (num > 4) {
                                int j = num % 2;
                                int k;
                                if (j == 1) k = 1;
                                else k = 0;
                                for (int i = 0; i < (num + 4)/2 + k; i++) {
                                    if (i < 4)
                                        System.out.print(mas[i] + " ");
                                    else
                                        if (k == 1)
                                            if (i == 4) System.out.print((mas[i] - mas[i - 1]) + " ");
                                            else
                                            if (i == 5) System.out.print(mas[i - 1] + " " +
                                                    (mas[i - 1] + 3) + " ");
                                            else
                                        System.out.print(mas[i - 1] + " "
                                                + (mas[i] - mas[i - 1])
                                                + " ");
                                        else
                                            System.out.print((mas[i] - mas[i - 1]) + " " + mas[i] + " ");
                                }
                            } else
                                {
                                for (int i = 0; i < num; i++) {
                                    if (i < 4)
                                        System.out.print(mas[i] + " ");
                                    else
                                        System.out.print((mas[i] - mas[i - 1]) + " " + mas[i] + " ");
                                }
                            }

                        } catch (InputMismatchException e) {
                            e.printStackTrace();
                        }
                        System.out.println();
                        break;
                    default:
                        System.out.println("Try again!");
                        System.out.println();
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
