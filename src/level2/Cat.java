package level2;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, Woman owner) {
        super(name, age, owner);
    }

}
