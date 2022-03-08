package day_1.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        String name1 = "Value1";
        String name2 = "Value2";
        String name3 = "Value3";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {

                System.out.println("Введите номер задания: 1, 2 или 3...");
                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                        StringCycle cycle = new StringCycle();
                        cycle.cycle();
                        System.out.println();
                        break;
                    case "2":
                        Salary salary = new Salary();
                        salary.aboutSalary();
                        System.out.println();
                        break;
                    case "3":
                        KillPeople killPeople = new KillPeople();
                        killPeople.killThemAll();
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
