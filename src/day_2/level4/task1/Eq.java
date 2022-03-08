package day_2.level4.task1;

public class Eq {

    public static void eq(String name1, String name2) {
        if (name1.equals(name2)) System.out.println("Имена идентичны");
        else if (name1.length() == name2.length())
            System.out.println("Длины имен равны");
        else System.out.println("Имена не равны");
    }
}
