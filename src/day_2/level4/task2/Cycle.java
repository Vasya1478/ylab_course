package day_2.level4.task2;

public class Cycle {
    public void cycle() {
        int i = 0;
        while (i < 10) {
            System.out.print((i + 1) + " ");
            i++;
        }
    }

    public void cycleReverse() {
        int i = 11;
        while (i > 0) {
            System.out.print((i - 1) + " ");
            i--;
        }
    }
}
