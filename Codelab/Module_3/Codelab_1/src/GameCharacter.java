public class GameCharacter {
    private String name;
    private int health;

    GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    protected void attack(GameCharacter target){
        System.out.println("Attacking " + target.name);
    }

    protected void aoeAttack(GameCharacter target, GameCharacter impactedTarget){
        System.out.printf("The attack is impacting %s", impactedTarget.getName());
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getHealth(){
        return this.health;
    }

    protected void setHealth(int health){
        this.health = health;
    }
}
