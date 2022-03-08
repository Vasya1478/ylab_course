package day_2.level4.task1;

public class Cat {

    private static int catsCount = 0;
    private String name;
    private String fullName;

    public static void addNewCat()
    {
        catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public static void setCatsCount(int catsCount)
    {
        catsCount = catsCount;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }

    public Cat(String name) {
        this.name = name;
    }
}