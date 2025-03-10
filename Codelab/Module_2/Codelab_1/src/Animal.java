public class Animal {
    // Properties
    String Name;
    String Type;
    String Sound;

    // Constructor for initial value when object being called
    // The scope is on the called object
    // Ex:
    // this.Name is for object's value, while Name is parameter that acquired when object is called
    // Animal("Cat")
    // this.Name still empty string and Name is "Cat"
    public Animal(String Name, String Type, String Sound) {
        this.Name = Name;
        this.Type = Type;
        this.Sound = Sound;
    }

    // Callable method, can be called by objectName.displayInfo();
    // Nothing special, just print
    void displayInfo(){
        System.out.println("Name: " + Name);
        System.out.println("Type: " + Type);
        System.out.println("Sound: " + Sound);
        System.out.println();
    }
}
