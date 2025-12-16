// Main class to test abstraction

public class Main {
    public static void main(String[] args) {

        // Abstract class reference holding child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog's sound
        a1.eat();   // Animal's method

        a2.sound(); // Cat's sound
        a2.eat();   // Animal's method
    }
}
