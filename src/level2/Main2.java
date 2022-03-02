package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите номер задания: 1, 2, 3 или 4...");
                String choice2 = reader2.readLine();

                switch (choice2) {
                    case "1":
                        Animal cat1 = new Cat("Вася", 3);
                        Animal cat2 = new Cat("Матроскин", 5);

                        cat1.showAnimal();
                        cat2.showAnimal();

                        System.out.println();
                        break;
                    case "2":
                        Animal max = new Dog("Max", 4);
                        Animal bella = new Dog("Bella", 3);
                        Animal jack = new Dog("Jack", 7);

                        max.showAnimal();
                        bella.showAnimal();
                        jack.showAnimal();

                        System.out.println();
                        break;
                    case "3":
                        Woman woman = new Woman("Ольга", 26);
                        Animal fish = new Fish("Немо", 1);
                        Animal cat = new Cat("Рыжик", 2);
                        Animal dog = new Dog("Шарик", 6);

                        fish.setOwner(woman);
                        cat.setOwner(woman);
                        dog.setOwner(woman);

                        fish.showAnimalWithOwner();
                        cat.showAnimalWithOwner();
                        dog.showAnimalWithOwner();

                        System.out.println();

                        break;
                    case "4":
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Первое число: ");
                        int num1 = scanner.nextInt();
                        System.out.println("Второе число: ");
                        int num2 = scanner.nextInt();
                        System.out.println("Третье число: ");
                        int num3 = scanner.nextInt();
                        System.out.println("Четвертое число: ");
                        int num4 = scanner.nextInt();

                        System.out.println("Минимум: ");
                        System.out.println(MaxMin.min(num1, num2, num3, num4));
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
