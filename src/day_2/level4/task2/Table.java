package day_2.level4.task2;

public class Table {
    public static int i;
    public static int j;
    public static int result;

    public static void showTable() {
        i = 1;
        while (i < 10) {
            j = 1;
            while (j < 10) {
                result = i * j;
                if (result > 9) System.out.print(" ");
                else System.out.print("  ");
                System.out.print(result);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
