public class Animal {
    String Name;
    String Type;
    String Sound;

    public Animal(String Name, String Type, String Sound) {
        this.Name = Name;
        this.Type = Type;
        this.Sound = Sound;
    }

    void displayInfo(){
        System.out.println("Name: " + Name);
        System.out.println("Type: " + Type);
        System.out.println("Sound: " + Sound);
        System.out.println();
    }
}
