package level2;

public class Animal {

    public String name;
    public int age;
    public Woman owner;

    public void setOwner(Woman owner) {
        this.owner = owner;
    }

    public void showAnimal() {
        System.out.println("Имя: '" + name + '\'' +
                ", возраст: " + age);
    }

    public void showAnimalWithOwner() {
        System.out.println("Имя: '" + name + '\'' +
                ", возраст: " + age + '\'' +
                ", владелец: " + owner.name);
    }

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, Woman owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
}
