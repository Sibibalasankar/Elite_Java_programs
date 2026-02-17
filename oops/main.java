package oops;

class Animal {

    int aid;
    String AnimalCategory;

    public Animal(String name, int id) {
        AnimalCategory = name;
        aid = id;
    }

    void details() {
        System.out.println(aid + " " + AnimalCategory);
    }
}

class Dog extends Animal {

    Dog(int id) {
        super("Dog", id);
    }

    void bark() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {

    Cat(int id) {
        super("Cat", id);
        aid = 321;
    }

    void details() {
        System.out.println("I am a " + aid + " " + AnimalCategory);
    }

    void Meow() {
        System.out.println("Meow");
    }
}

public class main {

    public static void main(String[] args) {
        Animal d = new Dog(123);
        Animal c = new Cat(124);
        c.details();
    }
}
