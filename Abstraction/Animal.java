// Abstract class representing general Animal
// This class provides abstraction

public abstract class Animal {

    // Abstract method (no implementation)
    // Child classes MUST implement this
    public abstract void sound();

    // Concrete method (has implementation)
    // This method is common for all animals
    public void eat() {
        System.out.println("Animal is eating");
    }
}
