class Animal {
    protected String name;
    protected double height; // in meters
    protected double weight; // in kilograms
    protected String color;

    public Animal(String name, double height, double weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Cow class
class Cow extends Animal {
    public Cow(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says moo.");
    }
}

// Cat class
class Cat extends Animal {
    public Cat(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says meow.");
    }
}

// Dog class
class Dog extends Animal {
    public Dog(String name, double height, double weight, String color) {
        super(name, height, weight, color);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says woof.");
    }
}

// Example usage
public class Lab9 {
    public static void main(String[] args) {
        Animal cow = new Cow("Bessie", 1.5, 600, "Brown");
        Animal cat = new Cat("Whiskers", 0.5, 4, "Gray");
        Animal dog = new Dog("Fido", 0.7, 12, "Black");

        cow.eat();
        cow.makeSound();
        cow.sleep();

        cat.eat();
        cat.makeSound();
        cat.sleep();

        dog.eat();
        dog.makeSound();
        dog.sleep();
    }
}