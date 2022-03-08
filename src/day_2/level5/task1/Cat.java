package day_2.level5.task1;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public Cat(String name) {

        this.name = name;
        this.age = 4;
        this.weight = 10;
        this.strength = 40;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
        this.strength = 40;
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = 40;
    }

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    boolean fight(Cat anotherCat) {
        if (this.strength > anotherCat.strength) {
            return true;
        } else if (this.strength < anotherCat.strength) {
            return false;
        } else if (this.weight > anotherCat.weight) {
            return true;
        } else if (this.weight < anotherCat.weight) {
            return false;
        } else if (this.age > anotherCat.age) {
            return true;
        } else return false;

    }
}
