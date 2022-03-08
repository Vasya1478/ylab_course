package day_2.ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        String name1 = null;
        String name2 = null;

        System.out.println("Начнем игру...");
        System.out.println("Первый игрок, назовите своё имя:");

        try {
            name1 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Player player1 = new Player(name1);
        player1.setCell('X');

        System.out.println("Второй игрок, назовите своё имя:");
        try {
            name2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Player player2 = new Player(name2);
        player2.setCell('0');

        Field field = new Field();
        field.initializeField();
        field.showField(field.getField());

        System.out.println("Чтобы сделать ход, необходимо сначала ввести " +
                "координату столбца, затем координату строки");

        int in = 2;
        boolean end = false;
        Raiting raiting = new Raiting();
        while (end != true) {
            if (in % 2 == 0) {
                System.out.println();
                System.out.println(player1.getName() + " делает ход");
                field.move(player1, scanner.nextInt(), scanner.nextInt());
                field.showField(field.getField());

                if (end == false) {
                    end = field.checkWinner(player1.getCell());
                    if (end == true) {
                        System.out.println(player1.getName() + " победил");
                        raiting.write(player1, 1);
                    } raiting.write(player1, 1);
                    raiting.read();

                }

                if (end == false) {
                    end = field.isTableFull();
                    if (end == true) System.out.println("Никто не победил");
                }
            } else {
                System.out.println();
                System.out.println(player2.getName() + " делает ход");
                field.move(player2, scanner.nextInt(), scanner.nextInt());
                field.showField(field.getField());
                if (end == false) {
                    end = field.checkWinner(player2.getCell());
                    if (end == true) {
                        System.out.println(player2.getName() + " победил");
                        raiting.write(player2, 1);
                    }

                }

                if (end == false) {
                    end = field.isTableFull();
                    if (end == true) System.out.println("Никто не победил");
                }
            }
            in++;

        }




    }


}
