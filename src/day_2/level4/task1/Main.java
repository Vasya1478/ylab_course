package day_2.level4.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите номер задания: 1, 2, 3, 4 или 5...");
                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        Cat cat1 = new Cat("Вася");
                        Cat.addNewCat();

                        Cat cat2 = new Cat("Мурка");
                        Cat.addNewCat();

                        System.out.println("Cats count is " + Cat.getCatsCount());

                        System.out.println();
                        break;
                    case "2":
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Первое число: ");
                        int num1 = scanner.nextInt();
                        System.out.println("Второе число: ");
                        int num2 = scanner.nextInt();
                        System.out.println("Третье число: ");
                        int num3 = scanner.nextInt();
                        System.out.println("Четвертое число: ");
                        int num4 = scanner.nextInt();

                        System.out.println("Максимум: ");
                        System.out.println(Maximum.max(num1, num2, num3, num4));
                        System.out.println();

                        break;
                    case "3":
                        int[] numArray = new int[3];
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("Первое число: ");
                        numArray[0] = scanner2.nextInt();
                        System.out.println("Второе число: ");
                        numArray[1] = scanner2.nextInt();
                        System.out.println("Третье число: ");
                        numArray[2] = scanner2.nextInt();

                        Sort sort = new Sort();
                        sort.sort(numArray);

                        System.out.println("Сортировка...");
                        for (int i = 0; i < numArray.length; i++) {
                            System.out.print(numArray[i] + " ");
                        }

                        System.out.println();

                        break;
                    case "4":
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Первое имя: ");
                        String name1 = sc.nextLine();
                        System.out.println("Второе имя: ");
                        String name2 = sc.nextLine();

                        Eq.eq(name1, name2);

                        System.out.println();

                        break;
                    case "5":
                        Scanner sc2 = new Scanner(System.in);
                        Person person = new Person();

                        System.out.println("Имя: ");
                        String pname = sc2.nextLine();
                        person.setName(pname);

                        System.out.println("Возраст: ");
                        int page = sc2.nextInt();
                        person.setAge(page);

                        if (person.getAge() < 18) System.out.println("Подрасти еще");
                        else
                            if (person.getAge() > 20)
                                System.out.println("И 18-ти достаточно");

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
