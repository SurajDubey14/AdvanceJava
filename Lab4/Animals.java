// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Animals {
    public static void main(String[] args) {
        // Create objects
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // Display sounds
        animal.makeSound(); // The animal makes a sound.
        dog.makeSound();    // The dog barks.
        cat.makeSound();    // The cat meows.
    }
}
