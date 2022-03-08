package day_2.level4.task3;

import day_2.level4.task2.Cycle;
import day_2.level4.task2.Square;
import day_2.level4.task2.StringAndNumber;
import day_2.level4.task2.Table;

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
                System.out.println("Введите номер задания: 1, 2 или 3...");
                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        Even.showEven();

                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Высота:");
                        int height = scanner.nextInt();
                        System.out.println("Ширина:");
                        int width = scanner.nextInt();
                        Rectangle.showRectangle(height, width);

                        System.out.println();

                        break;
                    case "3":
                        Triangle.showTriangle();

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
