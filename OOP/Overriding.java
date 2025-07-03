
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); 
        Animal dog = new Dog();
        dog.makeSound(); 

    }

}
