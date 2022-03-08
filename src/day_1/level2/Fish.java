package day_1.level2;

public class Fish extends Animal{

    public Fish() {
    }

    public Fish(String name, int age) {
        super(name, age);
    }

    public Fish(String name, int age, Woman owner) {
        super(name, age, owner);
    }
}
