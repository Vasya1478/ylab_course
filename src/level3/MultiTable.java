package level3;

public class MultiTable {
    public static int result = 1;
    public static void showTable() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                result = i * j;
                if (result > 9) System.out.print(" ");
                else System.out.print("  ");
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
