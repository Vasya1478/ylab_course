package level3;

import level1.KillPeople;
import level1.Salary;
import level1.StringCycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                        System.out.println("Введите число: ");
                        int number = scanner.nextInt();
                        System.out.println("Произведение: ");
                        System.out.println(Multiple.multiplication(number));
                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Введите число: ");
                        int num2 = scanner.nextInt();
                        System.out.println("Сумма: ");
                        Sum.sum(num2);
                        System.out.println();
                        break;
                    case "3":
                        System.out.println("Таблица умножения: ");
                        MultiTable.showTable();
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
