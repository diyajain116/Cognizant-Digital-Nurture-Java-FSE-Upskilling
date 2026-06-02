class Animal {

    // Method in parent class
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding parent method
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        // Create Animal object
        Animal animal = new Animal();

        // Create Dog object
        Dog dog = new Dog();

        // Call methods
        animal.makeSound();
        dog.makeSound();
    }
}
