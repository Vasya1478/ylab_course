package day_2.level4.task3;

public class Rectangle {
    public static void showRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
