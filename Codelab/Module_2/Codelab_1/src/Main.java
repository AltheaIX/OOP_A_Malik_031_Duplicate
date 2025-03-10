public class Main {
    public static void main(String[] args) {
        // Make object with properties / attribute
        Animal animal1 = new Animal("Cat", "Mammal", "Nyann~~~");
        Animal animal2 = new Animal("Dog", "Mammal", "Woof-Woof!!");

        // Call method from object / class
        animal1.displayInfo();
        animal2.displayInfo();
    }
}