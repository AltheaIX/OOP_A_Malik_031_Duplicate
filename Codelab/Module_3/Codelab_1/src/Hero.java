public class Hero extends GameCharacter {

    Hero(String name, int health) {
        super(name, health);
    }

    public void Camouflage(String name){
        setName(name);
        System.out.println("Camouflaged, hero's current name is  " + name);
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = 20;

        if(target.getHealth() < damage){
            target.setHealth(0);
            System.out.printf("%s attacks %s using Orbital Strike for %d HP.%n", this.getName(), target.getName(), damage);
            System.out.printf("Current %s's health: %d%n", target.getName(), target.getHealth());
            return;
        }

        System.out.printf("%s attacks %s using a sword for %d HP.%n", this.getName(), target.getName(), damage);
        target.setHealth(target.getHealth() - damage);
        System.out.printf("Current %s's health: %d%n", target.getName(), target.getHealth());
    }
}