package day_2.level4.task2;

import day_2.level4.task1.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите номер задания: 1, 2, 3 или 4 ...");
                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        Cycle cycle = new Cycle();
                        System.out.println("Числа от 1 до 10:");
                        cycle.cycle();
                        System.out.println();
                        System.out.println("Числа от 10 до 1:");
                        cycle.cycleReverse();

                        System.out.println();
                        break;
                    case "2":
                        StringAndNumber stringAndNumber = new StringAndNumber();
                        System.out.println("Строка: ");
                        String str = scanner.nextLine();
                        System.out.println("Число: ");
                        int num = scanner.nextInt();
                        stringAndNumber.stringAndNumber(str, num);

                        System.out.println();

                        break;
                    case "3":
                        Square square = new Square();
                        square.showSquare();

                        System.out.println();

                        break;
                    case "4":
                        Table.showTable();

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
