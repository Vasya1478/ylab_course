package day_2.level5.task1;

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

                        System.out.println("Создаём котов...");
                        Cat cat1 = new Cat("Вася", 3, 12, 45);
                        System.out.println("Имя: " + cat1.getName() + ", возраст: " + cat1.getAge()
                                + ", вес: " + cat1.getWeight() + ", сила: " + cat1.getStrength());
                        Cat cat2 = new Cat("Валера", 5, 10, 40);
                        System.out.println("Имя: " + cat2.getName() + ", возраст: " + cat2.getAge()
                                + ", вес: " + cat2.getWeight() + ", сила: " + cat2.getStrength());
                        boolean check;
                        check = cat1.fight(cat2);
                        if (check == true) {
                            System.out.println(cat1.getName() + " победил");
                        } else {
                            System.out.println(cat2.getName() + " победил");
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
