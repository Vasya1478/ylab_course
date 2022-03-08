package day_2.level4.task2;

public class Square {
    int i;
    int j;

    public void showSquare() {
        i = 10;
        while (i > 0) {
            j = 10;
            while (j > 0) {
                System.out.print("S");
                j--;
            }
            System.out.println();
            i--;
        }

    }

}
